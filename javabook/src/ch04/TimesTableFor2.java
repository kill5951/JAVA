package ch04;

public class TimesTableFor2 {

	public static void main(String[] args) {
		for(int i = 1; i<=9;i++){
			System.out.print(i+"��: ");
			for(int j = 1; j<=9; j++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}
