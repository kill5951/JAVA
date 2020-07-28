package ch08;

enum Family{
	father("아빠"), mother("엄마"), son("아들"), daughter("딸");
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
		System.out.printf("값 확인: %s, kor: %s%n", current, current.getKor());
		current.setKor("어머니");
		System.out.printf("값 확인: %s, kor: %s%n",current, current.getKor());
	}

}
