package ch08;

public class CalculatorLogicTest {

	public static void main(String[] args) {
		Calculator calcLogic = new calculatorImpl();
		int result = calcLogic.add(100, 200);
		System.out.printf("결과 확인: %d%n", result);
	}

}
