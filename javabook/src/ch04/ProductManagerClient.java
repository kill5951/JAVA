package ch04;

import java.util.Scanner;

public class ProductManagerClient {
	 String line = "****************************";
	String mainMenu = "��Ȳ��ȸ(L)\t��ǰ���(R)\t��ǰ�Ǹ�(S)\t����(X)";
	Scanner scanner = new Scanner(System.in);
	
	 void displayMainMenu(){
		do{
			System.out.printf("%s%n%s%n%s%n", line, mainMenu, line);
			String input = scanner.nextLine();
			if(input.equalsIgnoreCase("X")){
				System.out.println("�����մϴ�.");
				return;
			}else if (input.equalsIgnoreCase("L")){
				System.out.println("��Ȳ�� ��ȸ�մϴ�.");
			}else if (input.equalsIgnoreCase("S")){
				System.out.println("��ǰ�� �Ǹ��մϴ�.");
			}else if (input.equalsIgnoreCase("R")){
				System.out.println("��ǰ�� ����մϴ�.");
			}else{
				System.out.println("������ �޴��� �ƴմϴ�");
			}
		}while (true);
	}
			
	public static void main(String[] args) {
		ProductManagerClient pmc = new ProductManagerClient();
		pmc.displayMainMenu();
	}

}
