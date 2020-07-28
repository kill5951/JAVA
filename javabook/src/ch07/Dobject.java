package ch07;


public class Dobject {
	
	void draw(){
		System.out.println("Dobject");
	}
	
	public static void main(String[] args) {
		
		Dobject obj = new Dobject();
		Dobject l = new Line();
		Dobject r = new Rect();
		Dobject c = new Circle();
		
		obj.draw(); //?
		
		l.draw(); //?
		r.draw();	//?
		c.draw();	//?
		
		Line line = new Line();
		Dobject p = line;
		
		p.draw(); //?
	}
}

class Line extends Dobject{
	public void draw(){
		System.out.println("Line");
	}
}
	
class Rect extends Dobject{
	public void draw(){
			System.out.println("Rect");
		
	}
}


class Circle extends Dobject{
	public void draw(){
		System.out.println("Circle");
	}
}



	

	
