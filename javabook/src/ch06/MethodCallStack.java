package ch06;

public class MethodCallStack {

	public static void main(String[] args) {
		MethodCallStack mcs = new MethodCallStack();
		mcs.aMethod(); 
	}
	
	public void aMethod(){
		System.out.println("aMethod start");
		int age = 10;
		bMethod(age);	// 새로운 메서드 상자 요청
		System.out.println("aMethod end");
	}

	public void bMethod(int age){
		System.out.println("bMethod start");
		System.out.printf("나이는: %d%n",age);
		System.out.println("bMethod end");
	}
	
	
}
