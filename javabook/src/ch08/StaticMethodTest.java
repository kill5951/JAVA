package ch08;

interface StaticMethodInterface{
	static void staticMethod(){
		System.out.println("Static ¸Þ¼­µå");
	}
}

public class StaticMethodTest {

	public static void main(String[] args) {
		StaticMethodInterface.staticMethod(); 
	}

}
