package ch04;

public class Loop_LabelTest {

	public static void main(String[] args) {
		outer:
			for (int i = 1; i < 10; i++) {
		inner : 
			for (int j = 1; j < 10; j++) {
				if (j == 5) {
					break;
				}
				System.out.printf("%d*%d=%d\t", i, j, i * j);
			}
			System.out.println();
		}
	}
}
