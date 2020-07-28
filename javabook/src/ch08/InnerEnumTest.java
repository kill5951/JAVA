package ch08;

public class InnerEnumTest {
enum MyEnum{
	Date, Birth_date
}
public static void main(String[] args){
	System.out.println(MyEnum.Date);
	}
}

class OuterClass{
	public void useInnerEnum(){
		System.out.println(InnerEnumTest.MyEnum.Birth_date);
	}
}
