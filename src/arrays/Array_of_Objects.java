package arrays;

public class Array_of_Objects {

	public static void main(String[] args) {
		
		student[] stu = new student[3];
		
		stu[0] = new student("miko", 1);
		stu[1] = new student("neko", 2);
		stu[2] = new student("kiko", 3);
		
		for(int i=0;i<stu.length;i++) {
			System.out.println("Student name: " + stu[i].name + " ; Roll No. : "+ stu[i].roll_no);
		}
	}

}

class student{
	
	String name;
	int roll_no;
	
	student(String name, int roll){
		this.name = name;
		this.roll_no = roll;
	}
}