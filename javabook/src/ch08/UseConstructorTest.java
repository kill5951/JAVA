package ch08;

enum Family{
	father("�ƺ�"), mother("����"), son("�Ƶ�"), daughter("��");
	private String kor;
	
	Family(String kor){
		this.kor = kor;
	}
	public String getKor(){
		return kor;
	}
	public void setKor(String kor){
		this.kor = kor;
	}
}

public class UseConstructorTest {

	public static void main(String[] args) {
		Family current = Family.mother;
		System.out.printf("�� Ȯ��: %s, kor: %s%n", current, current.getKor());
		current.setKor("��Ӵ�");
		System.out.printf("�� Ȯ��: %s, kor: %s%n",current, current.getKor());
	}

}
