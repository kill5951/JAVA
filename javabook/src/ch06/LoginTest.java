package ch06;

public class LoginTest {
	// 이 클래스는 수정할 필요 없습니다.
	public static void main(String[] args) {
		Loginsystem login = new Loginsystem();
		LoginResult result = login.doLogin("hong","1234");
		result.printResult();	//false : 아이디를 확인하세요.
		
		result = login.doLogin("admin","12345");
		result.printResult();	//false : 비밀번호를 확인하세요.
		
		result = login.doLogin("admin","1234");
		result.printResult();	//true : admin님 반갑습니다.
		
	}		

}
