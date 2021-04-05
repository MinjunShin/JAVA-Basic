package staticex;

public class StudentTest2 {
	
	public static void main(String[] args) {		
		Student1 studentPark = new Student1();
		studentPark.setStudentName("하연");
		System.out.println(studentPark.studentName + "의 학번은" + Student1.serialNum);
		
		Student1 studentShin = new Student1();
		studentShin.setStudentName("민준");
		System.out.println(studentShin.studentName + "의 학번은" + Student1.serialNum);
		

	}
}
