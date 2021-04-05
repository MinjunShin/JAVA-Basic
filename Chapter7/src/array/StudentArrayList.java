package array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> Park = new ArrayList<Student>();
		
		
		Park.add(new Student(1001, "HY"));
		Park.add(new Student(1002, "MJ"));
		Park.add(new Student(1003, "SJ"));
		
		for(Student stu : Park) {
			stu.showInfo();
		}		

	}

}
