import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�.(Spring/Summer/Fall/Winter)");
		String season = sc.next();
		switch (season){
		 case "Spring" : System.out.println("�����մϴ�.");
		  break;
		 case "Summer" : System.out.println("�����ϴ�.");
		  break;
		 case "Fall" : System.out.println("�δ��մϴ�.");
		  break;
		 case "Winter" : System.out.println("����ϴ�.");
		  break;
		 default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		}
	}

