package ch10;

public class LocalInnerTest {
	int iMember = 1;
	static int cMember = 2;
	
	void method(){
		int localVar = 3;
		
		class LocalInner{
			int innerLocalVar = 4;
			void innerMethod(){
				System.out.println("�ܺ� �ν��Ͻ� ��� ����: "+iMember);
				System.out.println("�ܺ� Ŭ���� ��� ����: " + cMember);
				System.out.println("�ܺ� ���� ����: " + localVar); // �ڹ� 8 ���� ����
				System.out.println("���� �ν��Ͻ� ��� ����: " + innerLocalVar);
				
				iMember++;
				cMember++;
				//localVar++;
				innerLocalVar++;
				
			}
		}
		LocalInner IInner = new LocalInner();
		IInner.innerMethod();
	}
	public static void main(String[] args){
		LocalInnerTest lit = new LocalInnerTest();
		lit.method();
	}
}
