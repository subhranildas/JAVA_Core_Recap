package superKeyword;

public class Parent_Access {

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.show();
		obj.superShow();
	}

}

class Parent{		// parent class with variable
	int i = 3;
}

class Child extends Parent{	// child class with variable with same name
	int i = 8;
	void show() {
		System.out.println(i);	// child class value is printed 
	}
	void superShow() {
		System.out.println(super.i);	// parent class value is printed
	}
}