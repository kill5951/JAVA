package ch07;

public class InstanceOfTest {
	public void badcastin(){
		Person person = new Person();
		SpiderMan sman = (SpiderMan) person;
				sman.fireWeb();
	}
	
	public void goodCasting(){
		Person person = new Person();
		if(person instanceof SpiderMan){
			SpiderMan sman = (SpiderMan) person;
			sman.fireWeb();
		
		}else{
			System.out.println("SpiderMan�� �������� ���� ��ü");
		}
	}
	public static void main(String[] args){
		InstanceOfTest iot = new InstanceOfTest();
		// �Ʒ� �޼��� ȣ���� runtime ������ �߻���Ų��.
		// iot.badCasting();
		iot.goodCasting();
	}
}
