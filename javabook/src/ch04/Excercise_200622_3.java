package ch04;

import java.util.Scanner;

public class Excercise_200622_3 {

	public static void main(String[] args) {
		// 3. �������� �ƴ��� �Ǻ��ϱ�.
		//	   ���� % 4 == 0�̸� "����"
		//	   ���� % 4 != 0�̸� "���"
		//	   ���� % 100 == 0�̸� "���"
		//	   ���� % 400 == 0�̸� "����"
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>>>");
		int numYear = scanner.nextInt();
		if (numYear % 4 == 0 && numYear % 100 != 0 || numYear % 400 == 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
	}

}
