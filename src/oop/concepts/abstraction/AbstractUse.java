package oop.concepts.abstraction;

public class AbstractUse {

	// One good use of abstraction in Java //
	
	public static void main(String[] args) {
		
		Iphone obj1 = new Iphone();
		SamsungS4 obj2 = new SamsungS4();
		disp(obj1);
		disp(obj2);

	}
	
	public static void disp(phone obj) {	// creating obj of type phone
		obj.show();
	}

}

abstract class phone{						// abstract class with abstract method show
	public abstract void show();
}

class Iphone extends phone{					// show method for Iphone in class Iphone 
	public void show() {
		System.out.println("This is a Iphone");
	}
}

class SamsungS4 extends phone{				// show method for SamsungS4 in class SamsungS4
	public void show() {
		System.out.println("This is a Samsung");
	}
}