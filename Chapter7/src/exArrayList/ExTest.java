package exArrayList;

public class ExTest {
	public static void main (String[] args) {
		
		Student studentPark = new Student(1001, "Park");
		Student studentShin = new Student(1002, "Shin");
		
		studentPark.addSubject("����", 70);
		studentPark.addSubject("����", 80);
		
		studentShin.addSubject("����", 90);
		studentShin.addSubject("����", 80);
		studentShin.addSubject("�ڷᱸ��", 60);
		
		studentPark.ShowInfo();
		
		System.out.println("=============");
		
		studentShin.ShowInfo();	
		
	}

}
