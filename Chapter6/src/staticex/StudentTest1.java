package staticex;

public class StudentTest1 {

	public static void main(String[] args) {		
		Student studentPark = new Student();
		studentPark.setStudentName("�Ͽ�");
		System.out.println(studentPark.serialNum);
		studentPark.serialNum++;
		
		Student studentShin = new Student();
		studentShin.setStudentName("����");
		System.out.println(studentShin.serialNum);
		System.out.println(studentPark.serialNum);

	}

}
