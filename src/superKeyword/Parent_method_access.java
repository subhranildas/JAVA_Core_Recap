package superKeyword;

public class Parent_method_access {

	public static void main(String[] args) {
		
		C obj = new C();
		obj.show();

	}

}

class P{				// Parent Class
	
	void show() {		// show method of super Class
		System.out.println("Hello from Class P");
	}
}
class C extends P{		// Child Class
	void show() {		// show method of child Class
		super.show();	// Calling show method from super Class
		System.out.println("Hello from Class C");	
	}
}