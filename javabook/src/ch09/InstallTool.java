package ch09;

public class InstallTool {
	void copy(){
		System.out.println("파일 복사");
	}
	
	void install() throws Exception{
		System.out.println("설치");
		if(Math.random() > 0.5){
			throw new Exception("설치과정에서 문제 발생");
		}
	}
	void delete(){
		System.out.println("파일 삭제");
	}
}
