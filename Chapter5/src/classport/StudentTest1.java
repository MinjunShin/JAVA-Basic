package classport;

public class StudentTest1 {

	public static void main(String[] args) {
	
		Student student1 = new Student ( );
		Student student2 = new Student ( );
		
		student1.studentName = "SMJ";
		student2.studentName = "PHY";
		
		System.out.println(student1.getStudentName());
		System.out.println(student2.getStudentName());	
		
		
	}
}