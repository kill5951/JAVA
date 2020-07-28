package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HierarchyException {

	public static void main(String[] args){
		String src = "./.project";
		try{
			FileInputStream input = new FileInputStream(src);
			int readData = -1;
			while((readData = input.read()) != -1){
				System.out.print((char) readData);
			}
		}catch(FileNotFoundException e){
			System.out.printf("�������� ������ �����ϴ�.: %s%n", e.getMessage());
		}catch(IOException e){
			System.out.printf("���� �б⿡ �����߽��ϴ�. : %s%n",e.getMessage());
		}
		System.out.println("���� ���� �Ϸ�!");
	}
}
