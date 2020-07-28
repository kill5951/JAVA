package ch06;

public class OverloadConstructorPerson {
	String name = "�ƹ���";
	int age = 0;
	boolean isHungry = false;
	
	OverloadConstructorPerson(String name, int age, boolean isHungry){
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
	}
	
	OverloadConstructorPerson(String name, int age){
		this(name, age, false);
	}
	
	OverloadConstructorPerson(String name){
		this(name, 0, false);
	}
	
	OverloadConstructorPerson(){
		this("ȫ�浿", 100, false);
	}
	
	public static void main(String[] args) {
		
		OverloadConstructorPerson p1 = new OverloadConstructorPerson();
		System.out.println(p1.name +p1.age+p1.isHungry);
		
		OverloadConstructorPerson p2 = new OverloadConstructorPerson("������");
		System.out.println(p2.name+p2.age);
		
		OverloadConstructorPerson p3 = new OverloadConstructorPerson("�Ӳ���", 45);
		System.out.println(p3.name+p3.age);
 
		OverloadConstructorPerson p4 = new OverloadConstructorPerson("�念��", 30, true);
		System.out.println(p4.name+p4.age);
	}
}