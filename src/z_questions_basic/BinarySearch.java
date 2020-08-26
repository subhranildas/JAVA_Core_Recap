package z_questions_basic;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		ArrayList<Integer> ls= new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(9);
		int numberSearch=8;
		Integer[] input = new Integer[ls.size()];
		ls.toArray(input);
		int result = binarySearch(input,0,input.length-1,numberSearch);
		System.out.println(result);
		

	}
	
	static int binarySearch(Integer[] ls,int left,int right,int x) {
		if(right>=left) {
			int mid = left+(right-left)/2;
			if( ls[mid] == x) return mid;
			if(ls[mid]>x) return binarySearch(ls,left,mid-1,x);
			if(ls[mid]<x) return binarySearch(ls,mid+1,right,x);
		}
		return -1;
	}
}
