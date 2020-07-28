import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오>>>");
		int data1 = sc.nextInt();
		System.out.println("연산자(+, -, *, /)를 입력하시오>>>");
		String opr = sc.next();
		System.out.println("정수를 입력하시오>>>");
		int data2 = sc.nextInt();
		
		switch (opr){
		case "+" : System.out.println(data1 + data2);
		break;
		case "-" : System.out.println(data1 - data2);
		break;
		case "*" : System.out.println(data1 * data2);
		break;
		case "/" : System.out.println(data1 / data2);
		default : System.out.println("연산자를 바로 사용하세요.");
		}
		
		/*System.out.println("덧셈 : " + (data1 + data2) );
		System.out.println("뺄셈 : " + (data1 - data2) );
		System.out.println("곱셈 : " + (data1 * data2) );
		System.out.println("나눗셈 : " + (data1 / data2) );*/
		

	}

}
