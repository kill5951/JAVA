package ch08;

enum Greeting{
	good_morning, good_afternoon, good_evening;

String message;
public Greeting nextGreeting(){
	if(this.equals(good_evening)){
		return good_morning;
	}else if(this.equals(good_afternoon)){
		return good_evening;
	}else{
		return good_afternoon;
	}
 }
}
public class CustonMethodTest {
	public static void main(String[] args) {
		Greeting current = Greeting.good_afternoon;
		current.message = "Hello";
		Greeting next = current.nextGreeting();
		next.message = "Hi";
		System.out.printf("����: %s, �޽���: %s%n", current, current.message);
		System.out.printf("����: %s, �޽���: %s%n", next, next.message);
	}

}
