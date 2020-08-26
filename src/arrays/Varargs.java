package arrays;

public class Varargs {

	public static void main(String[] args) {
		
		int i=34,j=45,k=25;
		new Varargs().show(5);
		new Varargs().show(1,3,4);
		new Varargs().show(i,j,k);	// variables can also be send like this
		
	}
	
	void show(int ... a) {			// when unknown int type variables are send
		for(int i: a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	void show(int a) {
		System.out.println(a);
		System.out.println("Single int");
	}

}

