
public class Test2 {

	public static void main(String[] args) {
		int a =1;
		int b =2;
		int c =3;
		int max = a>b?a:b; //5>2?5
		max= max>c?max:c; //5>4?5
		System.out.println(max); //5
		
		int min = a<b?a:b;
		min=min<c?min:c;
		System.out.println("제일 작은 값 : "+min);
		
		System.out.println("값 : "+a+b+c);

	}

}
