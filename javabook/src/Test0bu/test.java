package Test0bu;

public class test {
	public static void main(String[] args){
		
		int sum = 0;
		int factorial = 1;
		for(int i=1;i<=5;i++){
			sum+=i;
			factorial *=i; 
		}
		System.out.println(sum);
		System.out.println(factorial);
	}
}
