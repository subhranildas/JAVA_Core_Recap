/*
 * Standard Input
 * 1			-->	Number of test cases
 * 5 2			--> Length of array and rotation number
 * 1 2 3 4 5	--> Array input
 * 
 * Standard Output
 * 4 5 1 2 3	--> Output, the rotated array
 * 
 * */




package z_questions_basic;
import java.util.Scanner;
public class ArrayRotation {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T>0) {

			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] A = new int[N];
			
			
			for(int i=0;i<N;i++) {
				A[(i+K)%N] = sc.nextInt();
			}
			sc.close();
			
			for(int i=0;i<N;i++) {
				System.out.print(A[i] + " ");
			}
			System.out.println();
			T--;
		}

	}

}
