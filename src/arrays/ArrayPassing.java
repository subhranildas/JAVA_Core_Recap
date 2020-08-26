package arrays;

public class ArrayPassing {

	public static void main(String[] args) {
		
		int[] myArr = {12,34,13,62};
		print(myArr); 				// Passing array in methods ;
		
		int[] sortedArr = sort(myArr);
		print(sortedArr);

	}
	
	// Method which takes an array as a parameter
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// Method which returns an array
	
	static int[] sort(int[] arr) {
		
		// simple bubble sort algo
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}
