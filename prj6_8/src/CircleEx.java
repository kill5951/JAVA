import java.util.Scanner;

public class CircleEx {

	public static void main(String[] args) {
		final double PI = 3.141592;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하시오(정수)>>");
		int radius = sc.nextInt();
		
		double area = radius*radius*PI;
		System.out.println(area);
	}

}
