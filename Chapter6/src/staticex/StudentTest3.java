package staticex;

public class StudentTest3 {
	public static void main(String[] args) {		
		Student2 studentPark = new Student2();
		studentPark.setStudentName("하연");
		
		System.out.println(studentPark.studentName + "의 학번은" + Student2.getSerialNum());
		
		Student2 studentShin = new Student2();
		studentShin.setStudentName("민준");
		System.out.println(studentShin.studentName + "의 학번은" + Student2.getSerialNum());
		

	}

}
