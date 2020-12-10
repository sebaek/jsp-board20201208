package member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class RemoveMemberHandler implements CommandHandler {
	private static final String FORM_VIEW = "removeForm";
	private RemoveMemberService removeMemberSvc = new RemoveMemberService();
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// **이전의 handler 메소드 내용 참조
		// get 요청이면 processForm 메소드 실행
		// post 요청이면 processSubmit 메소드 실행
		// 아니면 에러 응답
		return null;
	}
	
	private String processForm() {
		// **이전 handler processForm 메소드 참조
		// view의 이름을 리턴
		return "";
	}
	
	private String processSubmit() {
		// password 파라미터를 얻기
		
		// - errors 맵을 만들어서
		// - request attribute에 넣고
		
		// password 가 null 이거나 비어 있으면(empty)
		// - errors에 (코드와 true) 넣기
		// view의 이름을 리턴
	
		// 세션에서 user 객체 얻기(authUser attribute)
		
		// 서비스에게 일 시키기
		try {
			removeMemberSvc.removeMember(user, password);
			
			// 세션을 invalide()
			return "removeMemberSuccess";
		} catch () { // catch문 2개 (각 문제마다)
			// 문제가 생기면 (문제1. 사용자 없는 경우
			//               (문제2. 패스워드가 틀린 경우
			// - errors 맵에 코드 추가
			// 폼으로 forward하도록 view이름 리턴
			
		}
	}
}




