package ch03;

public class BitMask {

	public static void main(String[] args) {
		int homeElecStatus = 0;
		int tvCheck = 0b1;
		String result = "";
		result=(homeElecStatus&tvCheck)>0?"����":"����";
		System.out.println("tv ����:" +result);

		//tv �ѱ�
		homeElecStatus |= tvCheck;
		result=(homeElecStatus&tvCheck)>0?"����":"����";
		System.out.println("tv ����(�ѱ�):"+result);
		
		//tv ���� ����
		homeElecStatus ^= tvCheck;
		result=(homeElecStatus&tvCheck)>0?"����":"����";
		System.out.println("tv ����(����):"+result);
		
		//tv ���� 
		homeElecStatus &= ~tvCheck;
		result=(homeElecStatus&tvCheck)>0?"����":"����";
		System.out.println("tv ����(����):"+result);
	}

}
