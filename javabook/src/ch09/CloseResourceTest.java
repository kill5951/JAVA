package ch09;

import java.io.FileInputStream;
import java.io.IOException;

public class CloseResourceTest {
	public static void main(String[] args){
		CloseResourceTest crt = new CloseResourceTest();
		System.out.println("--�ִ� ����(������)�� ���");
		crt.useStreamOldStyle(".project");
		System.out.println("--���� ������ ���");
		crt.useStreamOldStyle("abc.txt");
	}
	public void useStreamOldStyle(String file){
		FileInputStream fileInput = null;
		try{
			fileInput = new FileInputStream(file);
			System.out.println("FileInputStream �� �����Ǿ����ϴ�.");
			fileInput.read();
		}catch(IOException e){
			System.out.println("���� ó�� ����");
		}finally{
			System.out.println("finally �� ����");
			if(fileInput != null){
				try{
					fileInput.close();
					System.out.println("FileInputStream�� ����Ǿ����ϴ�.");
				}catch(IOException e){
					System.out.println("FileInputStream ���� ����");
				}
			}
		}
	}
}
 