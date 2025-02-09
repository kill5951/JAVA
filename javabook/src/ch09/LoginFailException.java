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
			msg+= ", 아이디를 확인하십시오 휴먼.";
			break;
		case INVALID_PASS:
			msg+=", 비밀번호를 확인하십시오 휴먼.";
			break;
		}
		return msg;
	}
}

