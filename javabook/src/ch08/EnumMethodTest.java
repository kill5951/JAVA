package ch08;

enum Tea{
	coffee, black_tea, green_tea
}

public class EnumMethodTest {

	public static void main(String[] args) {
		Tea[] teaArray = Tea.values();
		for(Tea tea: teaArray){
			String strName = tea.name();
			System.out.printf("�̸�: %s%n", strName);
			System.out.printf("���� ����: %d%n", tea.ordinal());
			// ���ڿ��� �ٽ� EnumŸ������
			Tea reTea = Tea.valueOf(strName);
			System.out.printf("������ ��ü�� ������?: %b%n", reTea.equals(tea));
		}
	}
}
