package ch04;

import java.util.Scanner;

public class Excercise_200622_2 {

	public static void main(String[] args) {
		// 2. �� (x,y)�� ��ǥ(50,50) ~ (100,100) ���̿� ��ġ�ؾ� ��.
		//    ���� �ȿ� ��ġ�ϸ� "�簢�� �ȿ� ���� �ֽ��ϴ�."
		//    �ƴϸ� "���� �簢���� ������ϴ�."
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� (x,y)���� x���� �Է��Ͻÿ�>>>");
		int numX = scanner.nextInt();
		if (numX >= 50 && numX <= 100) {
			System.out.println("�� (x,y)���� y���� �Է��Ͻÿ�>>>");
			int numY = scanner.nextInt();
			if (numY >= 50 && numY <= 100) {
				System.out.println("�簢�� �ȿ� ���� �ֽ��ϴ�.");
			} else {
			System.out.println("���� �簢���� ������ϴ�.");
			}
		} else {
			System.out.println("���� �簢���� ������ϴ�.");
		}	
		scanner.close();
	}

}
