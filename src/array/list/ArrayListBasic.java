package array.list;

import java.util.ArrayList;

public class ArrayListBasic {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("developer");
		ar.add("name");
		for(String st:ar) {
			System.out.println(st);
		}
		ar.remove(0);
		for(String st:ar) {
			System.out.println(st);
		}
		// arraylist of class
		
		ArrayList<employee> emp = new ArrayList<employee>();
		emp.add(new employee("Subhranil",23));
		emp.add(new employee("Mikoto", 25));
		
		for(employee st: emp) {
			System.out.print(st.name + " " + st.age);
			System.out.println();
		}
		
		
		}
}
class employee{
	String name;
	int age;
	public employee(String name,int age) {
		this.name = name;
		this.age = age;
	}
}