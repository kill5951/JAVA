package Test07;
class Person{
	String name;
	int id;
}
public class Student extends Person{
	String dept;
	String grade;
	
	
	public static void main(String[] args) {
		Person p;
		Student s = new Student();
		p = s;
		p.name= "홍길동";
		p.id= 1;
		//p.grade ="A"; //오류확인
		//p.dept="Java";//오류확인
		
		Student s1 = (Student)p;
		System.out.println(s1.name);
		System.out.println(s1.id);
		s1.grade="A"; 	//오류없음
		s1.dept="java";	//오류없음
	}
}