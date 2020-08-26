package arrays;

public class Basic_Array_2D {

	public static void main(String[] args) {
		
		// Basic 2d array declaration 
		double[][] matrix = new double[2][2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				matrix[i][j] = i*j;
			}
		}
		
		// Basic 2d array traversing
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// 2d array declaration with values
		int[][]	val = {{0,1,2},{3,4,5},{6,7,8}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(val[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// 3d arrays can also be created
		// For each loop or enhanced for loop for 2d array
		for(int i[] : val) {
			for(int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
