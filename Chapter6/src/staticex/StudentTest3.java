package staticex;

public class StudentTest3 {
	public static void main(String[] args) {		
		Student2 studentPark = new Student2();
		studentPark.setStudentName("�Ͽ�");
		
		System.out.println(studentPark.studentName + "�� �й���" + Student2.getSerialNum());
		
		Student2 studentShin = new Student2();
		studentShin.setStudentName("����");
		System.out.println(studentShin.studentName + "�� �й���" + Student2.getSerialNum());
		

	}

}
