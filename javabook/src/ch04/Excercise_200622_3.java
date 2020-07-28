package ch04;

import java.util.Scanner;

public class Excercise_200622_3 {

	public static void main(String[] args) {
		// 3. 윤년인지 아닌지 판별하기.
		//	   연도 % 4 == 0이면 "윤년"
		//	   연도 % 4 != 0이면 "평년"
		//	   연도 % 100 == 0이면 "평년"
		//	   연도 % 400 == 0이면 "윤년"
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력하세요>>>");
		int numYear = scanner.nextInt();
		if (numYear % 4 == 0 && numYear % 100 != 0 || numYear % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
	}

}
