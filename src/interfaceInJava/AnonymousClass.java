package interfaceInJava;

interface inter{
	public void show();		// declaration of a method
}

public class AnonymousClass {

	public static void main(String[] args) {
		
		inter obj = new inter() {		// obj of inter type with definition of show() method
			public void show() {
				System.out.println("Hello show");
			}
		};
		
		obj.show();
	}

}
