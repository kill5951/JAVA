package ch03;

public class BitMask {

	public static void main(String[] args) {
		int homeElecStatus = 0;
		int tvCheck = 0b1;
		String result = "";
		result=(homeElecStatus&tvCheck)>0?"ÄÑÁü":"²¨Áü";
		System.out.println("tv »óÅÂ:" +result);

		//tv ÄÑ±â
		homeElecStatus |= tvCheck;
		result=(homeElecStatus&tvCheck)>0?"ÄÑÁü":"²¨Áü";
		System.out.println("tv »óÅÂ(ÄÑ±â):"+result);
		
		//tv »óÅÂ ¹İÀü
		homeElecStatus ^= tvCheck;
		result=(homeElecStatus&tvCheck)>0?"ÄÑÁü":"²¨Áü";
		System.out.println("tv »óÅÂ(¹İÀü):"+result);
		
		//tv ²ô±â 
		homeElecStatus &= ~tvCheck;
		result=(homeElecStatus&tvCheck)>0?"ÄÑÁü":"²¨Áü";
		System.out.println("tv »óÅÂ(²ô±â):"+result);
	}

}
