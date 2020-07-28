package ch05;

public class Basic_BoundsTest {

	public static void main(String[] args) {
		char [] charArray = new char [3];
		for(int i = 0; i < charArray.length; i++) {
			charArray[i] = (char)(i + 'A');
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d 번째 요소 : %c%n", i, charArray[i]);
		}
	}

}
