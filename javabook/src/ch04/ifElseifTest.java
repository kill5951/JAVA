package ch04;

import java.util.Scanner;

public class ifElseifTest {

	public static void main(String[] args) {
		System.out.println("32~126 ������ ������ �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int scanned = scanner.nextInt();
		String type = null;
		if(scanned>=48 && scanned<58){
			type="����";
		}else if(scanned >= 66 && scanned < 91){
			type="�빮��";
		}else if(scanned>=97&&scanned<123){
			type="�ҹ���";
		}else{
			type="��Ÿ Ÿ��";
		}
		System.out.printf("����%d�� ���ڷ� %c�̰� %s�Դϴ�.",scanned,scanned,type);
		scanner.close();
	}

}
