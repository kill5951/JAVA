package modifier.p2;

import modifier.p1.Parent;

public class OtherPackageSomeClass {
	public void method(){
		Parent p = new Parent();
		p.publicVar = 10;
		// The field Parent.privVar is not visible
		// p.protectVar = 10;
		// p.defaultVar = 10;
		// p.privVar = 10;
	}
}
