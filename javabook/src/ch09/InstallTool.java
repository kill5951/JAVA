package ch09;

public class InstallTool {
	void copy(){
		System.out.println("���� ����");
	}
	
	void install() throws Exception{
		System.out.println("��ġ");
		if(Math.random() > 0.5){
			throw new Exception("��ġ�������� ���� �߻�");
		}
	}
	void delete(){
		System.out.println("���� ����");
	}
}
