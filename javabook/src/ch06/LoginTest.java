package ch06;

public class LoginTest {
	// �� Ŭ������ ������ �ʿ� �����ϴ�.
	public static void main(String[] args) {
		Loginsystem login = new Loginsystem();
		LoginResult result = login.doLogin("hong","1234");
		result.printResult();	//false : ���̵� Ȯ���ϼ���.
		
		result = login.doLogin("admin","12345");
		result.printResult();	//false : ��й�ȣ�� Ȯ���ϼ���.
		
		result = login.doLogin("admin","1234");
		result.printResult();	//true : admin�� �ݰ����ϴ�.
		
	}		

}
