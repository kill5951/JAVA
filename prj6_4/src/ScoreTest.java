import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("������ �Է��ϼ���.");
	int score = sc.nextInt();
	/*if (score > 100){
		 System.out.println("�߸��� �Է��Դϴ�.");
	 }
	 if (score>=90 ){
		 System.out.println("A");
	 }else if(score>=80){
		 System.out.println("B");
	 }else if(score>=70){
		 System.out.println("C");
	 }else if (score>=60){
		 System.out.println("D");
	 }*/
	
	switch (score/10){
	case 10 : System.out.println("A");
		break;
	case 9: System.out.println("A");
		break;
	case 8 : System.out.println("B");
		break;
	case 7 : System.out.println("C");
		break;
	case 6 : System.out.println("D");
		break;
	default : System.out.println("F");
	}
	 }
	}
 	

