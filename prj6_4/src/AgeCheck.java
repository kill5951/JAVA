import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하시오.");
		int age = sc.nextInt();
		
		//System.out.println("나이가 14살 이상인가요?" + (age>=14));
		
		if (age >= 18){
			System.out.println("성인입니다.");
		}else if (age < 14){
			System.out.println("어린이 입니다.");
		}else{
			System.out.println("청소년 입니다.");
		}
		

	}

}
