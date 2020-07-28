package ch08;

abstract class GoodVehicle {
	private int curX, curY;

	public void reportPosition(){
	System.out.printf("현재 위치: (%d, %d)%n", curX, curY);
	}

	public abstract void addFuel();
}



class DieselSUV1 extends GoodVehicle{
	@Override
	public void addFuel(){
		System.out.println("주유소에서 급유");
	}
}

class ElectricCar1 extends GoodVehicle{
	@Override
	public void addFuel(){
		System.out.println("급속 충전");
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
