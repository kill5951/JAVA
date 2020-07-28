package ch08;

public class TypeParameterMethodTest<T> {

	T some;
	
	public TypeParameterMethodTest(T some){
		this.some = some;
	}
	
	public<P> void method1(P p){
		System.out.println("Ŭ���� ������ T" + some.getClass().getName());
		System.out.println("�Ķ����: "+p.getClass().getName());
	}
	
	public<P> P method2(P p){
		System.out.println("Ŭ���� ������ T"+some.getClass().getName());
		System.out.println("�Ķ����:" + p.getClass().getName());
		return p;
	}
	public static void main(String[] args) {
		TypeParameterMethodTest<String>tpmt = new TypeParameterMethodTest<>("Hello");
		tpmt.method1(10);
		tpmt.<Long>method2(20L);
	}

}
 