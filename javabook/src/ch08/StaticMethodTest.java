package ch08;

interface StaticMethodInterface{
	static void staticMethod(){
		System.out.println("Static �޼���");
	}
}

public class StaticMethodTest {

	public static void main(String[] args) {
		StaticMethodInterface.staticMethod(); 
	}

}
