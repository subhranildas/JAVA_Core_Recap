package arrays;

public class Basic_Array_1D {

	public static void main(String[] args) {
		
		// Different ways to declare an array
		int[] myNum = {12,34,22,56};
		
		int[] nextNum = new int[4];
		
		int Number[] = new int[3];
		
		int myArray[] = new int[] {23,45,24,56};
		
		// array using
		
		System.out.println(myNum[3]);
		
		nextNum[0] = 3;
		nextNum[1] = 4;
		nextNum[2] = 14;
		nextNum[3] = 37;
		
		for(int i=0;i<4;i++) {
			System.out.print(nextNum[i] + " ");
		}
		System.out.println();
		
		for(int i=0;i<3;i++) {
			System.out.print(Number[i] + " ");
		}
		// default values are assigned in java for int it is zero
		System.out.println();
		
		// For each loop in an array
		for(int a : myArray) {
			System.out.print(a + " ");
		}
		
	}

}
