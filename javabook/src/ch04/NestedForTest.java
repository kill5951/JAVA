package ch04;

public class NestedForTest {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++){
			for(int j = 0; j<10 && j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
