package ch08;

class Person{}
class SpiderMan extends Person{}
class PersonBox<T>{}

public class wildtypeTest{
	public void method1(PersonBox<?> come){}
	public void method2(PersonBox<?extends Person>some){}
	public void method3(PersonBox<? super Person>some){}

	public static void main(String[] args) {
		wildtypeTest wtt = new wildtypeTest();
		
		wtt.method1(new PersonBox<Object>());
		wtt.method1(new PersonBox<Person>() );
		wtt.method1(new PersonBox<SpiderMan>());
		
		//wtt.method2(new PersonBox<Object>());
		wtt.method2(new PersonBox<Person>());
		wtt.method2(new PersonBox<SpiderMan>());
		
		wtt.method3(new PersonBox<Object>());
		wtt.method3(new PersonBox<Person>());
		//wtt.method3(new PersonBox<SpiderMan>());
	}

}
