package Test07;

public class SuperClass {
	String x = "super";
	
	public void method(){
		System.out.println("super class method");
	}
	
	
	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		System.out.println(subClass.x);
		subClass.method();
		
		SuperClass superClass = subClass;
		System.out.println(superClass.x);
		superClass.method();
	}
	
		
		

}


class SubClass extends SuperClass{
	String x = "sub";//this.x, super.x
	
	public void method(){
		System.out.println("sub class method");
	}

	
}
