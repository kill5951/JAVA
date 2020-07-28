package ch08;

class Vehicle{
	private int curX, curY;
	
	public void reportPosition(){
		System.out.printf("������ġ: (%d, %d)%n", curX, curY);
	}
	public void addFuel(){
		System.out.println("��� ��� ������ ���ᰡ �ʿ�");
	}
}

class DieselSUV extends Vehicle{
	@Override
	public void addFuel(){
		System.out.println("�����ҿ��� ����");
	}
}

class ElectricCar extends Vehicle{
	@Override
	public void addFuel(){
		System.out.println("�޼� ����");
	}
}


public class VehicleTest {

	public static void main(String[] args) {
		Vehicle[] vehicles = { new DieselSUV(), new ElectricCar() };
		for (Vehicle v : vehicles){
			v.addFuel();
			v.reportPosition();
		}
	}

}
