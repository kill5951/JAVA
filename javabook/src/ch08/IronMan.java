package ch08;

public class IronMan implements Heroable{
	int weaponDamage = 100;

	@Override
	public int fire(){
		System.out.printf("�� �߻�: %d��ŭ�� �������� ����%n");
		return this.weaponDamage;
	}
	
	
	@Override
	public void chageShape(boolean isHeroMode) {
		if(isHeroMode){
			System.out.println("�尩 ����");
		}else{
			System.out.println("�尩 ����");
		}
		
	}
	
	
	@Override
	public void upgrade(){
		int before = weaponDamage;
		weaponDamage += weaponDamage * 0.1;
		System.out.printf("���� ���� ����: %d-->%d%n", before, weaponDamage);
	}
}
