package ch06;

public class ParameterPerson {
	String name;
	int age;
	boolean isHungry;
	
	//�Ķ���� ������ : ���� �⺻ �����ڴ� �߰����� �ʴ´�.
	ParameterPerson(String n, int a, boolean i){
		name = n;
		age=a;
		isHungry=i;
	}
	public static void main(String[] args) {
		ParameterPerson person = new ParameterPerson("ȫ�浿", 10, true);
		// ParameterPerson p2 = new ParameterPerson();
	}

}
