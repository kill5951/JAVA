package ch08;

interface DefaultMethodInterface{
	void abstractMethod();
	
	default void defaultMethod(){
		System.out.println("�̰��� �⺻ �޼����Դϴ�.");
	}
}


public class DefaultMethodTest implements DefaultMethodInterface {

	@Override
	public void abstractMethod() {
		System.out.println("�ڽĿ��� �ݵ�� ������ �ʿ�");
	}
	
	public static void main(String[] args) {
		DefaultMethodTest dmt = new DefaultMethodTest();
		dmt.abstractMethod();
		dmt.defaultMethod();
	}

}
