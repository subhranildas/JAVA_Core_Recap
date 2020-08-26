package arrays;

public class CloneArray {

	public static void main(String[] args) {
		
		int[] arr = {12,2,34,23};
		int[] myArr = arr;			// in this case all the data of arr gets copied to myArr
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i] + " ");
		}
		System.out.println();
		System.out.println(arr==myArr);		// here we get true because its a real copy
		System.out.println();
		
		myArr[1] = 67;						// here we change the value of arr[1] or myArr[1]
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");	// the value of arr[1] changes
		}
		System.out.println();
		
		for(int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i] + " ");// the value of myArr[1] will also change
		}
		System.out.println();
		
		
		char[] chArray = {'a','b','c'};
		char[] cloneArray = chArray.clone();	// the data of the clone will be same
		for(char a: cloneArray) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println(chArray==cloneArray); 	// here we get false since its a clone
		
		cloneArray[2] = 'd';					// here i change the data of the clone array
		for(char a: chArray) {
			System.out.print(a + " ");			// the real data does not change
		}
		System.out.println();
		for(char a: cloneArray) {
			System.out.print(a + " ");			// clone data does change
		}
	}

}
