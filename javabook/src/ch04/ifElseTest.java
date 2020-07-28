package ch04;

import java.util.Random;

public class ifElseTest {

	public static void main(String[] args) {
		String result = null;
		Random myRandom = new Random();
		
		System.out.println("큰수? 작은수?");
		int num1 = myRandom.nextInt(100);	// 0~99 사이의 정수
		if (num1>=50){
			result = "큰수";
		}else{
			result = "작은수";
		}
		System.out.printf("%d는(은) %s이다%n", num1, result);
		System.out.println("짝수일까?");
		int num2 = myRandom.nextInt(10); // 0~9사이의 정수
		
		if(num2 % 2 == 0){
			result = "짝수";
		}else{
			result = "홀수"; 
		}
		System.out.printf("%d는(은) %s입니다. %n",num2,result);
	
	// 삼항 연산자(조건부 연산자)를 이용하는 형태
		result = (num2 % 2 == 0) ? "짝수" : "홀수";
		System.out.printf("%d는(은) %s입니다.%n", num2, result);
	}

}
