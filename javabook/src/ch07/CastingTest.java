package ch07;


public class CastingTest {
	public void primitive(){
		byte b = 10;
		// 묵시적 형변환: 작은 집 --> 큰집
		int i=b;
		// 명시적 형변환: 큰집 --> 작은 집
		byte b2 = (byte)i;
	}
	
	public void reference(){
		// 묵시적 형변환: 작은 집 --> 큰집
		Person p = new SpiderMan();
		// p.fireWeb(); -- 메모리에 있지만 사용할 수 없다.
		// 명시적 형변환: 큰집 --> 작은 집
		SpiderMan sman = (SpiderMan)p;
		sman.fireWeb();
	}
	
}
