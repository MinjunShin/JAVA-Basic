package exArrayList;

public class ExTest {
	public static void main (String[] args) {
		
		Student studentPark = new Student(1001, "Park");
		Student studentShin = new Student(1002, "Shin");
		
		studentPark.addSubject("국어", 70);
		studentPark.addSubject("수학", 80);
		
		studentShin.addSubject("국어", 90);
		studentShin.addSubject("수학", 80);
		studentShin.addSubject("자료구조", 60);
		
		studentPark.ShowInfo();
		
		System.out.println("=============");
		
		studentShin.ShowInfo();	
		
	}

}
