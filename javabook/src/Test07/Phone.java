package Test07;

class Phone {
	public String number;
	public Phone aboutMe(){
		return this;
	}

}
class HandPhone extends Phone{
	public int weight = 100;
	@Override 
	public HandPhone aboutMe() {
		return this;
	}
}

