import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�>>>");
		int data1 = sc.nextInt();
		System.out.println("������(+, -, *, /)�� �Է��Ͻÿ�>>>");
		String opr = sc.next();
		System.out.println("������ �Է��Ͻÿ�>>>");
		int data2 = sc.nextInt();
		
		switch (opr){
		case "+" : System.out.println(data1 + data2);
		break;
		case "-" : System.out.println(data1 - data2);
		break;
		case "*" : System.out.println(data1 * data2);
		break;
		case "/" : System.out.println(data1 / data2);
		default : System.out.println("�����ڸ� �ٷ� ����ϼ���.");
		}
		
		/*System.out.println("���� : " + (data1 + data2) );
		System.out.println("���� : " + (data1 - data2) );
		System.out.println("���� : " + (data1 * data2) );
		System.out.println("������ : " + (data1 / data2) );*/
		

	}

}
