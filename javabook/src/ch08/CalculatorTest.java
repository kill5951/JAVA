package ch08;

import java.util.Scanner;

class CalculatorStub implements Calculator {
	@Override
	public int add(int a, int b){
		System.out.printf("�Ķ���� Ȯ��: %d, %d%n", a, b);
		return 0;
	}
}
class CalculatorClient{
	Calculator calcLogic = new calculatorImpl();//CalculatorStub();
	
	public void add(){
		System.out.println("ù��° ������ �Է��Ͻÿ�.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("�ι�° ������ �Է��Ͻÿ�.");
		int b = scanner.nextInt();
		System.out.printf("���: %d+%d=%d%n", a, b, calcLogic.add(a,b));
	}
}
public class CalculatorTest {
	public static void main(String[] args) {
		CalculatorClient client = new CalculatorClient();
		client.add();
	}

}
