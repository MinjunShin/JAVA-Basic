package staticex;

public class StudentTest2 {
	
	public static void main(String[] args) {		
		Student1 studentPark = new Student1();
		studentPark.setStudentName("�Ͽ�");
		System.out.println(studentPark.studentName + "�� �й���" + Student1.serialNum);
		
		Student1 studentShin = new Student1();
		studentShin.setStudentName("����");
		System.out.println(studentShin.studentName + "�� �й���" + Student1.serialNum);
		

	}
}
