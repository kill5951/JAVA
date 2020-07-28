package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultiExceptionHandling {

	public static void main(String[] args){
		try{
			Class.forName("ch09.exeption.MultiExceptionHandling");
			new FileInputStream("Hello.java");
			DriverManager.getConnection("Hello");
		} catch(ClassNotFoundException e){
			System.out.printf("Ŭ������ ã�� �� �����ϴ�.: %s%n", e.getMessage());
		}catch (FileNotFoundException e){
			System.out.printf("������ ã�� �� �����ϴ�.: %s%n",e.getMessage());
		}catch(SQLException e){
			System.out.printf("DB ���� ����: %s%n", e.getMessage());
		}
		System.out.println("���α׷� ���� ����");
	}
}
