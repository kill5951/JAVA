import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���.");
		String line = scanner.nextLine();
		System.out.printf("�Է��� ���ڿ� : %s%n", line);
		System.out.println("������ �Է��ϼ���.");
		int num1 = scanner.nextInt();
		System.out.printf("�Է��� ����: %d%n", num1);
		System.out.println("�Ǽ��� �Է��ϼ���");
		double num2 = scanner.nextDouble();
		System.out.printf("�Է��� �Ǽ�: %f%n",num2);
		System.out.println("�Ҹ����� �Է��ϼ���.");
		boolean bool = scanner.nextBoolean();
		System.out.printf("�Է��� �Ҹ���: %b%n", bool);
		scanner.close();
	}
}
