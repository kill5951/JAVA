package ch04;

public class Loop_ContinueTest {
	public static void main(String[] args) {
		System.out.println("1~1000������ ���� �� 3�� ����� ����?");
		int sum = 0;
		for (int j =1; j<=1000; j++) {
			if (j % 3 > 0) {
				continue;
			}
			sum += j;
		}
		System.out.println("1~1000������ ���� �� 3�� ����� ����?" + sum);

	}

}
