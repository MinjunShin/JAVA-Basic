package staticex;

public class StudentTest4 {
	public static void main(String[] args) {		
		Student3 studentPark = new Student3();
		studentPark.setStudentName("�Ͽ�");
		
		
		System.out.println(studentPark.StudentName + "�� �й���" + Student3.SerialNo);
		System.out.println(studentPark.StudentName + "�� ī���ȣ��" + Student3.CardNo);
		
		Student3 studentShin = new Student3();
		studentShin.setStudentName("����");
		System.out.println(studentShin.StudentName + "�� �й���" + Student3.SerialNo);
		System.out.println(studentShin.StudentName + "�� ī���ȣ��" + Student3.CardNo);

	}

}
