package ch04;

import java.util.Scanner;

public class Excercise_200622_4 {

	public static void main(String[] args) {
		// 369���� : 1 ~ 99������ ���� ����.
		// 3,6,9 1�� ���� : "�ڼ�¦" ���.
		// 3,6,9 2�� ���� : "�ڼ�¦¦" ���.
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 ~ 99 ������ ������ �Է��Ͻÿ�>>>");
		int num = scanner.nextInt();
		
		int digit10 = num / 10;
		int digit1 = num % 10;
		
		int clapCnt = 0;	// �ڼ��� Ƚ��
		
		if(digit10 % 3 == 0 && digit10 != 0) {clapCnt++;}
		if(digit1 % 3 == 0 && digit1 != 0) {clapCnt++;}
		
		if(clapCnt == 2) {
			System.out.println("�ڼ�¦¦");
		} else if(clapCnt == 1) {
			System.out.println("�ڼ�¦");
		}
	}
}
