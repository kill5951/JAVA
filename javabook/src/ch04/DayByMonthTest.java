package ch04;

import java.util.Scanner;

public class DayByMonthTest {

	public static void main(String[] args) {
		System.out.println("���� 1~12������ �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int days = 0;
		switch(month){
		case 2:
			days = 28;
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		default:
			days=31;
		}
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.",month,days);
		scanner.close();
	}

}
