package ch04;

import java.util.Scanner;

public class Excercise_200622_4 {

	public static void main(String[] args) {
		// 369게임 : 1 ~ 99까지의 정수 범위.
		// 3,6,9 1개 포함 : "박수짝" 출력.
		// 3,6,9 2개 포함 : "박수짝짝" 출력.
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 ~ 99 사이의 정수를 입력하시오>>>");
		int num = scanner.nextInt();
		
		int digit10 = num / 10;
		int digit1 = num % 10;
		
		int clapCnt = 0;	// 박수의 횟수
		
		if(digit10 % 3 == 0 && digit10 != 0) {clapCnt++;}
		if(digit1 % 3 == 0 && digit1 != 0) {clapCnt++;}
		
		if(clapCnt == 2) {
			System.out.println("박수짝짝");
		} else if(clapCnt == 1) {
			System.out.println("박수짝");
		}
	}
}
