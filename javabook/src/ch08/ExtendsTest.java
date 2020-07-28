package ch08;

class NumberBox<T extends Number>{
	
	public void addsomes(T...ts){
		double d = 0;
		for(T t : ts){
			d += t.doubleValue();
		}
		System.out.println("√— «’¿∫: "+d);
	}
}


public class ExtendsTest {

	public static void main(String[] args) {
		NumberBox<Number> numBox = new NumberBox<>();
		numBox.addsomes(1.5, 5, 4L);
		
		NumberBox<Integer> intBox = new NumberBox<>();
		intBox.addsomes(1,2,3);
		//NumberBox<String> strBox= 
						new NumberBox<>(); // Bound mismatch
	}

}