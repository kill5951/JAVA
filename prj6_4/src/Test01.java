import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�>>>");
		int num = sc.nextInt();
		
		//if((num%5)==0){
			//System.out.println("5�� ����Դϴ�.");
		//}else System.out.println("5�� ����� �ƴմϴ�.");
		
		switch (num){
		case 100 : System.out.println("100");
		break;
		case 200 : System.out.println("200");
		break;
		case 300 : System.out.println("300");
		break;
		}
	}

}
