import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��Ͻÿ�.");
		int age = sc.nextInt();
		
		//System.out.println("���̰� 14�� �̻��ΰ���?" + (age>=14));
		
		if (age >= 18){
			System.out.println("�����Դϴ�.");
		}else if (age < 14){
			System.out.println("��� �Դϴ�.");
		}else{
			System.out.println("û�ҳ� �Դϴ�.");
		}
		

	}

}
