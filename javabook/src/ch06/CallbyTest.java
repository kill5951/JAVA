package ch06;

public class CallbyTest {
	int memberVar = 10;
	
	static void change1(int var){
		var += 10;
		System.out.printf("change1 : %d%n", var);
	}
	
	static void change2(CallbyTest cbtl){
		cbtl.memberVar += 100;
		System.out.printf("change2:%d%n",cbtl.memberVar);
	}
	
	public static void main(String[] args) {
		CallbyTest cbt = new CallbyTest();
		cbt.memberVar = 5;
		System.out.printf("change1 호출전 memberVar: %d%n",cbt.memberVar);
		
		change1(cbt.memberVar);
		System.out.printf("change1 호출후 memberVar: %d%n",cbt.memberVar);
		
		change2(cbt);
		System.out.printf("change2 호출후 memberVar: %d%n",cbt.memberVar);
	}

}
 