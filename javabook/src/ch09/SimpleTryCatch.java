package ch09;

public class SimpleTryCatch {

	public static void main(String[] args) {
		int[] intArray = { 10 };
		try{
			System.out.println(intArray[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println("���ܰ� �߻������� ó����: �迭 ũ�� Ȯ�� �ʿ�");
		}
		System.out.println("���α׷� �����մϴ�.");
	}

}
