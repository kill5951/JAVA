package ch05;

public class Basic_SimpleArray {

	public static void main(String[] args) {
		int [] points = new int[3];
		System.out.printf("�迭�� ũ�� : %d%n", points.length);
		
		points[0] = 1;
		points[1] = 'A';
		// points[2] = 1.5;		// ���� �ƴ�.
		
		System.out.printf("0��° ��� : %d%n", points[0]);
		System.out.printf("1��° ��� : %d%n", points[1]);
		System.out.printf("2��° ��� : %d%n", points[2]);

	}

}
