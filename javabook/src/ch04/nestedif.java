package ch04;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���̸� �Է��ϼ���.");
		int age = scanner.nextInt();
		
		System.out.println("��ȣ�ڰ� �����ϳ���?");
		boolean withParent = scanner.nextBoolean();
		
		if(age>=12){
			result="������";
		}else{
			if(withParent){
				result="���̴� ������ ��ȣ�ڰ� �־ ������";
			}else{
				result = "���̰� ���� ��ȣ�ڵ� ��� �����Ұ�";
			}
		}
		System.out.printf("����: %d, ��ȣ�� ����: %b, ���: %s",age,withParent,result);
		scanner.close();
	}

}
