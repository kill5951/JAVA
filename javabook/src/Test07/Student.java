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
		p.name= "ȫ�浿";
		p.id= 1;
		//p.grade ="A"; //����Ȯ��
		//p.dept="Java";//����Ȯ��
		
		Student s1 = (Student)p;
		System.out.println(s1.name);
		System.out.println(s1.id);
		s1.grade="A"; 	//��������
		s1.dept="java";	//��������
	}
}