package ch07;

public class SpiderMan2 extends Person{
	Spider spider = new Spider();
	boolean isSpider;

	public void fireWeb(){
		if(isSpider){
			spider.fireWeb();
		}else{
			System.out.println("Person�� �Ź��� �߻� �Ұ�");
		}
	}

	@Override
	public void jump(){
		if(isSpider){
			spider.jump();
		}else{
			System.out.println("�ٱ�");
		}
	}
}
