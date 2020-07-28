import java.util.Scanner;

public class Ar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//int[] a = new int[5];
		//for(int i=0; i<5;i++){
		
		//System.out.println("정수를 입력하시오>>");
		//a[i] = sc.nextInt(); 
		
		//}
		//for(int i=0; i<a.length;i++){
		//	System.out.println(a[i]);
		//}
		
		//System.out.println(a[i]);
		
		
		int[] a = new int[5];
		for(int i=0; i<5;i++){
			System.out.println("양수를 입력하시오>>");
			a[i] = sc.nextInt();
			}	
		
		for(int i=0; i<a.length;i++){
			System.out.println(a[i]);
		}
		int max = a[0];
		int min = 0;
		for(int i=1; i<a.length; i++){
		if(max < a[i]) max=a[i];
		if(min > a[i]) min=a[i];
		}
		System.out.println("min = "+min);
		System.out.println("max = "+max);
	}

}


