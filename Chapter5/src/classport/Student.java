package classport;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}

	public static void main(String[] args) {
		
		Student studentAhn = new Student (); // student Class »ı¼º
		studentAhn.studentName = "SMJ";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
