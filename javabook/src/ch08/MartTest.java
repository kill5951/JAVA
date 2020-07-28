package ch08;

import java.util.Date;

class Fruit{}
class Company{}
class Market<P>{
	protected P product;
}
interface Useable<D>{}

class Mart<C,P,D> extends Market<P> implements Useable<D>{
	private C coworker;
	
	public Mart(C coworker, P puoduct){
		this.coworker = coworker;
		this.product = product;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mart[coworker=" + coworker + ", product=" + product+ "]"; 
	}
}

public class MartTest {
	public static void main(String[] args) {
		Mart<Company, Fruit, Date>mart = new Mart<>(new Company(), new Fruit());
		System.out.println(mart);
	}

}
