package ch10;

public class InstanceInnerTest {
	class Inner{
		int innerMember = 10;
		//static int staticMember = 10;
		static final int finalStaticMember = 20;
		
		private void innerMethod(){
			System.out.println("Om :"+ outerMember + ",Im:"+innerMember);
		}
	}
	
	private int outerMember = 1;
	
	private void outerMethod(){
		Inner inner = new Inner();
		inner.innerMember = 100;
		inner.innerMethod();
	}

	public static void main(String[] args){
		InstanceInnerTest iit = new InstanceInnerTest();
		Inner inner = iit.new Inner();
		inner.innerMethod();
	}
}
