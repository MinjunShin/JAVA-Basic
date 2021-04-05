package array;

public class Student {
	 int StudentID;
	 String StudentName;
	
	Student(){
		
	}
	
	Student(int studentID, String studentName){
		this.StudentID = studentID;
		this.StudentName = studentName;
	}
	
	
	public void showInfo() {		
		System.out.println(StudentID + "." + StudentName);
	}
	
}
