package ch08;

enum Season{
	spring, summer, fall, winter // ���� 0 1 2 3�� oridinal ���� ����
}

public class SeasonEnumTest {

	public void compareEnum(Season season){
		if(season.equals(Season.spring)){
			System.out.println("������ �����Դϴ�.");
		}else if(season.compareTo(Season.winter)<0){
			System.out.println("�ּ��� �ܿ��� �ƴ��ݾƿ�.");
		}else{
			System.out.println(season.compareTo(Season.winter));
		}
	}

	public void enumSwitch(Season season){
		switch(season){
		case spring:
			System.out.println("�� ���� ���� �ñ�");
			break;
		case summer:
			System.out.println("���Ű� ���� �ʹ� �ñ�");
			break;
		case fall:
			System.out.println("���� �������� �ñ�");
			break;
		default:
			System.out.println("�ܿ����� �ڴ� �ñ�");
		}
	}
	
	public static void main(String[] args) {
		SeasonEnumTest set = new SeasonEnumTest();
		set.compareEnum(Season.fall);
		set.enumSwitch(Season.spring);
	}

}
