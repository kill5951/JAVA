package ch05;

public class Basic_SimpleArray {

	public static void main(String[] args) {
		int [] points = new int[3];
		System.out.printf("배열의 크기 : %d%n", points.length);
		
		points[0] = 1;
		points[1] = 'A';
		// points[2] = 1.5;		// 정수 아님.
		
		System.out.printf("0번째 요소 : %d%n", points[0]);
		System.out.printf("1번째 요소 : %d%n", points[1]);
		System.out.printf("2번째 요소 : %d%n", points[2]);

	}

}
