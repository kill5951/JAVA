package ch04;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		do{
			System.out.println("�������� �˰� ���� ���ڸ� �Է��ϼ���.(�׸��ϰ� ������ 0)");
			i = scanner.nextInt();
			System.out.println(i+"�� �������� : "+Math.sqrt(i));
		}while(i>0);
		
		System.out.println("���α׷� ����");
	}

}