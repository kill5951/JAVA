package ch07;


public class CastingTest {
	public void primitive(){
		byte b = 10;
		// ������ ����ȯ: ���� �� --> ū��
		int i=b;
		// ����� ����ȯ: ū�� --> ���� ��
		byte b2 = (byte)i;
	}
	
	public void reference(){
		// ������ ����ȯ: ���� �� --> ū��
		Person p = new SpiderMan();
		// p.fireWeb(); -- �޸𸮿� ������ ����� �� ����.
		// ����� ����ȯ: ū�� --> ���� ��
		SpiderMan sman = (SpiderMan)p;
		sman.fireWeb();
	}
	
}
