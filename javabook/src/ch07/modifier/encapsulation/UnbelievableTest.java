package ch07.modifier.encapsulation;

class UnbelievableUserInfo {
	// �̸��� null�� �ɼ� ����.
	public String name = "ȫ�浿";
	// ���´� 0���� Ŀ�� ��.
	public int account = 10000;
}
public class UnbelievableTest{
	public static void main(String[] args) {
		UnbelievableUserInfo info = new UnbelievableUserInfo();
		System.out.printf("����� ����: %s, %d%n", info.name, info.account);
		info.name = null;
		info.account = -1000;
		System.out.printf("����� ����: %s, %d%n", info.name, info.account);

	}

}
