package member.service;

import auth.service.User;
import member.dao.MemberDao;

public class RemoveMemberService {
	private MemberDao memberDao = new MemberDao();
	
	public void removeMember(User user, String password) {
		// 0. 커넥션 얻기
		
		// 1. dao의 selectById로 member객체 얻기
		//    1.1 member없으면 MemberNotFoundException 발생
		
		// 2. password와 member.password가 같은 지 확인
		//    2.1 다르면 InvalidPasswordException 발생
		
		// 3. delete() 실행
		
	}
}
