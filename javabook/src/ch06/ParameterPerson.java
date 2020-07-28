package ch06;

public class ParameterPerson {
	String name;
	int age;
	boolean isHungry;
	
	//파라미터 생성자 : 이제 기본 생성자는 추가되지 않는다.
	ParameterPerson(String n, int a, boolean i){
		name = n;
		age=a;
		isHungry=i;
	}
	public static void main(String[] args) {
		ParameterPerson person = new ParameterPerson("홍길동", 10, true);
		// ParameterPerson p2 = new ParameterPerson();
	}

}
