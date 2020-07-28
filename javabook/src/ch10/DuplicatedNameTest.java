package ch10;

public class DuplicatedNameTest {
	private int num = 100;

	class InnerClass{
		private int num = 200; // �̸� �浹
		
		public void method(){
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(DuplicatedNameTest.this.num);
		}
	}
	
	public static void main(String[] args){
		DuplicatedNameTest dnt = new DuplicatedNameTest();
		InnerClass ic = dnt.new InnerClass();
		ic.method();
	}
}
