package ch04;

import java.util.Scanner;

public class TimesTableFor1 {

	public static void main(String[] args) {
		System.out.println("����� ���� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		
		for(int i = 1; i<=9; i++){
			System.out.print(dan + "*"+i+"="+(dan*i)+"\t");
		}
	}

}
