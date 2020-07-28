package ch06;

public class InitializerTest {
	int iv;
	static int cv;
	
	static 	{	//Ŭ���� �ʱ�ȭ ���
		System.out.println("static initializer");
		cv=100;
	}
	
	{	// �ν��Ͻ� �ʱ�ȭ ���
		System.out.println("instance initializer");
		iv = 100;
	}
	public InitializerTest(){	//�Ķ���� ���� ������
		System.out.printf("constructor iv: %d, cv:%d%n",iv,cv);
		this.iv = 300;
	}
	
	public static void main(String[] args) {
		InitializerTest it = new InitializerTest();
		System.out.printf("��ü 1 ���� ��- cv: %d, iv: %d%n",InitializerTest.cv,it.iv);
		InitializerTest it2 = new InitializerTest();
		System.out.printf("��ü 2 ���� ��- cv: %d, iv: %d%n",InitializerTest.cv, it2.iv);
	}

}
