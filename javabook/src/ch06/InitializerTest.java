package ch06;

public class InitializerTest {
	int iv;
	static int cv;
	
	static 	{	//클래스 초기화 블록
		System.out.println("static initializer");
		cv=100;
	}
	
	{	// 인스턴스 초기화 블록
		System.out.println("instance initializer");
		iv = 100;
	}
	public InitializerTest(){	//파라미터 없는 생성자
		System.out.printf("constructor iv: %d, cv:%d%n",iv,cv);
		this.iv = 300;
	}
	
	public static void main(String[] args) {
		InitializerTest it = new InitializerTest();
		System.out.printf("객체 1 생성 후- cv: %d, iv: %d%n",InitializerTest.cv,it.iv);
		InitializerTest it2 = new InitializerTest();
		System.out.printf("객체 2 생성 후- cv: %d, iv: %d%n",InitializerTest.cv, it2.iv);
	}

}
