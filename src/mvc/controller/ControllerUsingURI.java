package mvc.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

/**
 * Servlet implementation class ControllerUsingURI
 */

public class ControllerUsingURI extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String prefix = "/WEB-INF/view/";
	private String suffix = ".jsp";
	private Properties properties = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerUsingURI() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	ServletContext application = getServletContext();
  		String filePath = application
  				.getRealPath("/WEB-INF/commandHandlerURI.properties");
  		
  		try (FileReader fr = new FileReader(filePath);) {
  			this.properties = new Properties();
  			properties.load(fr);
  		} catch (Exception e) {
  			e.printStackTrace();
  		}
  		
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		String root = request.getContextPath();
		
		String command = "";
		if (uri.startsWith(root)) {
			command = uri.substring(root.length());
		}
		
		CommandHandler handler = null;
		
		String className = properties.getProperty(command);
		
		try {
			Class c = Class.forName(className);
			Object o = c.newInstance();
			handler = (CommandHandler) o;
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		int b = 0;
		
		while ((b = fr.read()) != -1) {
			System.out.print((char) b);
		}
		*/

		/*
		if (command.equals("/join.do")) {
			handler = new JoinHandler();
		} else if (command.equals("/login.do")) {
			handler = new LoginHandler();
		} else if (command.equals("/logout.do")) {
			handler = new LogouHandler();
		} else {
			handler = new NullHandler();
		}
		*/
		
		String view = null;
		try {
			view = handler.process(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher(prefix + view + suffix)
			.forward(request, response);
	}

}





