package ch04;

import java.util.Scanner;

public class Excercise_200622_1 {

	public static void main(String[] args) {
		// 1. A, B -> "�� ���Ͽ����ϴ�."
		//    C, D -> "�� �� ����ϼ���."
		//       F -> "���� �б⿡ �ٽ� �����ϼ���."
		System.out.println("������ �Է��ϼ���>>>");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if (score >= 91 && score <= 100) {
			System.out.println("A��� �� ���Ͽ����ϴ�.");
		} else if (score >= 81 && score <= 90) {
			System.out.println("B��� �� ���Ͽ����ϴ�.");
		} else if (score >= 71 && score <= 80) {
			System.out.println("C��� �� �� ����ϼ���.");
		} else if (score >= 61 && score <= 70) {
			System.out.println("D��� �� �� ����ϼ���.");
		} else if (score >= 0 && score <= 60) {
			System.out.println("F��� ���� �б⿡ �ٽ� �����ϼ���.");
		} else {
			System.out.println("�Է��� ������ �ùٸ����ʽ��ϴ�.");
		}		
		scanner.close();
		
	}

}
