import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오>>>");
		int num = sc.nextInt();
		
		//if((num%5)==0){
			//System.out.println("5의 배수입니다.");
		//}else System.out.println("5의 배수가 아닙니다.");
		
		switch (num){
		case 100 : System.out.println("100");
		break;
		case 200 : System.out.println("200");
		break;
		case 300 : System.out.println("300");
		break;
		}
	}

}
