package ch09;

public class LoginFailException extends RuntimeException{
	enum ErrorCode{
		INVALID_ID, INVALID_PASS
	}
	
	private ErrorCode errorCode;
	
	public LoginFailException(ErrorCode errorCode, String data){
		super(data);
		this.errorCode = errorCode;
	}
	@Override
	public String getLocalizedMessage() {
		String msg = this.getMessage();
		switch(errorCode){
		case INVALID_ID:
			msg+= ", ���̵� Ȯ���Ͻʽÿ� �޸�.";
			break;
		case INVALID_PASS:
			msg+=", ��й�ȣ�� Ȯ���Ͻʽÿ� �޸�.";
			break;
		}
		return msg;
	}
}

