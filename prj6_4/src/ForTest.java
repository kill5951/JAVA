
public class ForTest {

	public static void main(String[] args) {
		//int i = 1;
		//for(i=1; i<=10; i++){
		//	System.out.println("i="+i+"hello");
		//}
		//System.out.println(i);
		
		// i=1 sum = 1;  				=> i=1 sum = i;								=> i=1 sum = i;
		// i=2 sum = 1+2;				=> i=2 sum = 1+i;							=> i=2 sum = sum+i;
		// i=3 sum = 1+2+3;				=> i=3 sum = 1+2+i;							=> i=3 sum = sum+i;
		// i=4 sum = 1+2+3+4;			=> i=4 sum = 1+2+3+i;						=> i=4 sum = sum+i;	
		
		// i=10 sum = 1+2+3+...+10;		=> i=10 sum = 1+2+3+...+i;					=> i=10 sum = sum+i;
	
		int sum = 0;
		int factorial = 1;
		int average = 1;
		for(int i=1; i<=10; i++){
			sum = sum+i;
			factorial = factorial * i;		
			System.out.println("i= "+i+" sum = "+sum);
			System.out.println("i= "+i+" fac = "+factorial);
			System.out.println("ЦђБе = "+(sum/10));
			
		}
		
	}
	

}
