package loops;

public class ForLoopBasic {
	
	public static void main(String[] args) {
		
		// Basic for loop
		for(int i=0;i<3;i++) {
			System.out.println("Loop 1 runnings!");
		}
		
		// for loop with decrement
		for(int j=3;j>=0;j--) {
			System.out.println("Loop 2 running!");
		}
		
		// for loop also work in this way
		int k=0;	// initialization
		for(;;) {
			
			if(!(k<3)) {	// condition
				break;
			}
			
			System.out.println("Loop 3 running!"); // for loop body
			
			k++; // increment
		}
		
		//For each loop also known as enhanced for loop
		int[] val = {1,3,4,45};		// You need to know array for this (look at arrays package)
		for(int a: val) {
			System.out.print(a + " ");
		}
		
		// For using on 2d array refer to 'Basic_Array_2D.java'
		
		
	}
	
}
