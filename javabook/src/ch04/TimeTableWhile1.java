package ch04;

import java.util.Scanner;

public class TimeTableWhile1 {

	public static void main(String[] args) {
		System.out.println("����� ���� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		
		int i = 1;
		while (i<=9){
			System.out.print(dan+"*"+i+"="+(dan*i)+"\t");
			i++;
		}
		System.out.println();
	}

}
