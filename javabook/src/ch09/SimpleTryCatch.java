package ch09;

public class SimpleTryCatch {

	public static void main(String[] args) {
		int[] intArray = { 10 };
		try{
			System.out.println(intArray[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println("예외가 발생했지만 처리함: 배열 크기 확인 필요");
		}
		System.out.println("프로그램 종료합니다.");
	}

}
