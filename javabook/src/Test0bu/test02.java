package Test0bu;

public class test02 {

	public static void main(String[] args) {
	/* 
	변수
	자바에서 사용되는 데이터를 저장하는 메모리 공간
	한번에 하나의 데이터만 저장 가능
	언제든 다른 데이터로 대체될 수 있다(변할수있다)
	변수를 사용하기 위해서는 변수 선언이 먼저 진행되어야 한다.
	변수에 데이터를 저장하는것을 변수 초기화라고 한다.
	
	<변수 선언 기본 문법>
	데이터 타입 변수명;
	=>데이터타입: 기본형 또는 참조형 타입명 명시
	=>변수명: 식별자 작성 규칙에 따른 변수명 지정
	
	변수 초기화 기본 문법
	변수명 = 데이터(또는 변수명);
	*/	
	int a; // 정수형 데이터를 저장할 수 있는 공간을 마련하면서 a라는 이름을 지정한다.
	// => 변수 선언을 하지 않은 상태로는 변수 사용이 불가
	a = 1; // 정수형 변수 a에 정수 데이터 1을 저장한다.(정수형 변수 a를 1로 초기화)
	// => 변수 초기화를 하지 않은 상태로는 변수 데이터 사용 불가
	
	System.out.println(a); // 정수형 변수 a의 데이터를 꺼내서 출력
	
		
	
	a = 99;
	System.out.println(a);
	
	byte b = 100;
	System.out.println(b);
	
	short s = 200;
	System.out.println(s);
	
	long l = 100L;
	System.out.println(l);
	
	float f = 1.5f;
	System.out.println(f);
	
	double d = 3.14;
	System.out.println(d);
	
	char ch = 'A';
	System.out.println(ch);
	
	boolean bool = true;
	System.out.println(bool);
	
	String str = "Hello, World!";
	System.out.println(str);
	
	
	}

}
