package ch04;

public class BreakTest {

	public static void main(String[] args) {
		System.out.println("�������� 1000���� ���� ���� ū ������?");
		int i = 0;
		while(true){
			if(Math.pow(i, 2) > 1000){
				break;
			}
			i++;
		}
	System.out.println((--i));
	}

}
