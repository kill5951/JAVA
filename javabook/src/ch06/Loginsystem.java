package ch06;

public class Loginsystem {
	public LoginResult doLogin(String id, String pass){
		LoginResult result = new LoginResult();
	if(id.equals("admin") && pass.equals("1234")){
		result.result =true;
		result.message = id+ "�� �ݰ����ϴ�.";
	}else if(!id.equals("admin")){
		result.message = "���̵� Ȯ���ϼ���";
	}else{
		result.message = "��й�ȣ�� Ȯ���ϼ���";
	}
	return result;
	}
}
