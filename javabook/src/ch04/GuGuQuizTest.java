package ch04;

import java.util.Random;
import java.util.Scanner;

public class GuGuQuizTest {

	public static void main(String[] args) {
		System.out.println("������ ������ ���߼���. �׸��Ϸ��� 0 �Է�");
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		while(true){
			int num1 = random.nextInt(9)+1;
			int num2 = random.nextInt(9)+1;
			System.out.printf("%d*%d=%n",num1,num2);
		int result = scanner.nextInt();
		if(result == 0){
			break;
		}else{
			if(result == num1*num2){
				System.out.println("�����Դϴ�.");
			}else{
				System.out.println("������ "+(num1*num2)+"�Դϴ�.");
			}
		}
		}
		scanner.close();
	}

}
