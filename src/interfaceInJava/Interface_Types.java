package interfaceInJava;

// various types of interfaces //

// Marker Interface -> without any methods
// SAM -> Single Abstract Method -> Functional Interface
// Normal


interface mikoto{
	void show();
}


public class Interface_Types {

	public static void main(String[] args) {
		
		mikoto obj = () -> System.out.println("Mikoto says hello");	// for SAM interface only
		obj.show();
	}

}
