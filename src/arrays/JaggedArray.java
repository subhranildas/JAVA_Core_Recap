package arrays;
import java.util.Random;		// random class for random number generation

public class JaggedArray {

	public static void main(String[] args) {
		
		Random rad = new Random();		// object of Random class
		int[][] myarr = new int[3][];
		myarr[0] = new int[3];
		myarr[1] = new int[2];
		myarr[2] = new int[4];
		
		for(int i=0;i<myarr.length;i++) {
			for(int j=0;j<myarr[i].length;j++) {
				myarr[i][j] = rad.nextInt(20);	// random integer generation
			}
		}
		
		int[][] jaggedarr = {{1},{1,2},{1,2,3}};	// another way if values already known
		
		
		print(myarr);
		System.out.println();
		print(jaggedarr);
		

	}
	
	// method for printing out the array
	static void print(int[][] arr) {
		for(int i[]: arr) {
			for(int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
