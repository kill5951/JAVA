package ch04;

import java.util.Scanner;

public class Excercise_200622_1 {

	public static void main(String[] args) {
		// 1. A, B -> "참 잘하였습니다."
		//    C, D -> "좀 더 노력하세요."
		//       F -> "다음 학기에 다시 수강하세요."
		System.out.println("점수를 입력하세요>>>");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if (score >= 91 && score <= 100) {
			System.out.println("A등급 참 잘하였습니다.");
		} else if (score >= 81 && score <= 90) {
			System.out.println("B등급 참 잘하였습니다.");
		} else if (score >= 71 && score <= 80) {
			System.out.println("C등급 좀 더 노력하세요.");
		} else if (score >= 61 && score <= 70) {
			System.out.println("D등급 좀 더 노력하세요.");
		} else if (score >= 0 && score <= 60) {
			System.out.println("F등급 다음 학기에 다시 수강하세요.");
		} else {
			System.out.println("입력한 점수가 올바르지않습니다.");
		}		
		scanner.close();
		
	}

}
