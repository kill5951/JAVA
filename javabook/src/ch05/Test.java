package ch05;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] data = {100,90,80,70,60};
	
		for(int j=0;j<data.length-1;j++){
			for(int i=0; i<data.length-1;i++){
				if(data[i]>data[i+1]){
					int tmp = data[i];
					data[i]=data[i+1];
					data[i+1]=tmp;
					}
			}
		}

		//Arrays.sort(data);
		
		for(int a : data)
			System.out.println(a+" ");
	}
}
