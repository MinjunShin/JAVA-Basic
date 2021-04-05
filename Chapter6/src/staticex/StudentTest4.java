package staticex;

public class StudentTest4 {
	public static void main(String[] args) {		
		Student3 studentPark = new Student3();
		studentPark.setStudentName("하연");
		
		
		System.out.println(studentPark.StudentName + "의 학번은" + Student3.SerialNo);
		System.out.println(studentPark.StudentName + "의 카드번호는" + Student3.CardNo);
		
		Student3 studentShin = new Student3();
		studentShin.setStudentName("민준");
		System.out.println(studentShin.StudentName + "의 학번은" + Student3.SerialNo);
		System.out.println(studentShin.StudentName + "의 카드번호는" + Student3.CardNo);

	}

}
