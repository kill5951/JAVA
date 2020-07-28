package ch04;

import java.util.Scanner;

public class Excercise_200622_2 {

	public static void main(String[] args) {
		// 2. 점 (x,y)가 좌표(50,50) ~ (100,100) 사이에 위치해야 함.
		//    범위 안에 위치하면 "사각형 안에 점이 있습니다."
		//    아니면 "점이 사각형을 벗어났습니다."
		Scanner scanner = new Scanner(System.in);
		System.out.println("점 (x,y)에서 x값을 입력하시오>>>");
		int numX = scanner.nextInt();
		if (numX >= 50 && numX <= 100) {
			System.out.println("점 (x,y)에서 y값을 입력하시오>>>");
			int numY = scanner.nextInt();
			if (numY >= 50 && numY <= 100) {
				System.out.println("사각형 안에 점이 있습니다.");
			} else {
			System.out.println("점이 사각형을 벗어났습니다.");
			}
		} else {
			System.out.println("점이 사각형을 벗어났습니다.");
		}	
		scanner.close();
	}

}
