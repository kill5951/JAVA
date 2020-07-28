package ch08;

abstract class GoodVehicle {
	private int curX, curY;

	public void reportPosition(){
	System.out.printf("���� ��ġ: (%d, %d)%n", curX, curY);
	}

	public abstract void addFuel();
}



class DieselSUV1 extends GoodVehicle{
	@Override
	public void addFuel(){
		System.out.println("�����ҿ��� ����");
	}
}

class ElectricCar1 extends GoodVehicle{
	@Override
	public void addFuel(){
		System.out.println("�޼� ����");
	}
}


public class goodVehicleTest {

	public static void main(String[] args) {
		GoodVehicle[] vehicles = { new DieselSUV1(), new ElectricCar1() };
		for(GoodVehicle v : vehicles){
			v.addFuel();
			v.reportPosition();
		}
	}

}
