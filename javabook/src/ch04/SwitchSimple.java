package ch04;

public class SwitchSimple {

	public static void main(String[] args) {
		int level = 0;
		String levelString = "";
		switch (level){
		case 0:
			levelString = "��� ����, ȸ������, �۾���, ����";
			break;
		case 1:
			levelString = "ȸ������, �۾���, ����";
			break;
		case 2:
			levelString = "�۾���, ����";
			break;
		default:
			levelString = "����";
		}
		System.out.println("����� ������: "+levelString);
	}

}
