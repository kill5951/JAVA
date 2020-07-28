
public class Test1 {
	public static void main(String[] args) {
		int count; //변수 선언
		count = (int)0.0; //
		System.out.println(count); //0
		count =128;
		byte b =(byte)count;
		System.out.println(b); //128
		double sum = 0.0;
		System.out.println(sum); //0.0
		sum=100.0;
		System.out.println(sum); //100
	
		char c ='나';
		int a = c; //자동 형변환(유니코드로)
		System.out.println((char)a); //명시적 형변환
	
		System.out.println("나는 이미연");
		System.out.println("양산");
		System.out.println("01046541636");

		
	}

}
