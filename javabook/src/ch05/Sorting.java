package ch05;

import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		Random rand = new Random();
		int temp = 0;
		int[] arr = new int[10];
		for (int i = 0; i<10;i++){
			arr[i]= rand.nextInt(100);
		}
		System.out.println("�ʱ� ����");
		for(int i:arr){
			System.out.printf("%d\t",i);
		}
	// ����
		for(int i = 0; i<arr.length-1;i++){
			for(int j=0; j<arr.length -1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\n���� ��");
		for (int i:arr){
			System.out.printf("%d \t",i);
		}
	}
	
}
 