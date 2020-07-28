import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계절을 입력하시오.(Spring/Summer/Fall/Winter)");
		String season = sc.next();
		switch (season){
		 case "Spring" : System.out.println("따뜻합니다.");
		  break;
		 case "Summer" : System.out.println("덥습니다.");
		  break;
		 case "Fall" : System.out.println("싸늘합니다.");
		  break;
		 case "Winter" : System.out.println("춥습니다.");
		  break;
		 default : System.out.println("잘못입력하셨습니다.");
		}
		}
	}

