package classport;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();
		Student studentEx = new Student();
		
		studentAhn.studentName = "PHY";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
