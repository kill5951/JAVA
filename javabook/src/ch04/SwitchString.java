package ch04;

public class SwitchString {

	public static void main(String[] args) {
		String levelString = "";
		String level = "������";
		switch(level){
		case "������":
			levelString = "��ڰ���, ȸ������, �۾���, ����";
			break;
		case "���":
			levelString = "ȸ������, �۾��� ,����";
			break;
		case "ȸ��":
			levelString = "�۾���, ����";
			break;
		default:
			levelString = "����";
		}
		System.out.println("����� ������: "+levelString);
	}

}