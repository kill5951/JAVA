package ch09;

import java.util.Random;

public class TryCatchFlow {

	public static void main(String[] args) {
		int num = new Random().nextInt(2);
		try{
			System.out.println("code 1, num:"+num);
			int i = 1/num;
			System.out.println("code 2 - ���� ����");
		}catch(ArithmeticException e){
			System.out.println("code 3 - ���� ó�� �Ϸ�");
		}
		System.out.println("code 4");
	}

}
