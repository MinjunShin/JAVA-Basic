package gradeCalc;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("박하연", "2016217211", "국어국문학과");
		Student student2 = new Student("신민준", "2019611017", "컴퓨터공학과");
		Student student3 = new Student("안성훈", "2019211013", "국어국문학과");
		Student student4 = new Student("오태훈", "2019213015", "국어국문학과");
		Student student5 = new Student("이동호", "2019611166", "컴퓨터공학과");
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		student1.addScoreData("국어", 95);
		student1.addScoreData("수학", 56);
		
		student2.addScoreData("국어", 95);
		student2.addScoreData("수학", 98);
		
		student3.addScoreData("국어", 100);
		student3.addScoreData("수학", 88);
		
		student4.addScoreData("국어", 89);
		student4.addScoreData("수학", 98);
		
		student5.addScoreData("국어", 83);
		student5.addScoreData("수학", 56);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
	
		student1.showKoreanInfoHeader();
		student1.showKoreanInfo();
		student2.showKoreanInfo();
		student3.showKoreanInfo();
		student4.showKoreanInfo();
		student5.showKoreanInfo();
		
		student1.showMathInfoHeader();
		student1.showMathInfo();
		student2.showMathInfo();
		student3.showMathInfo();
		student4.showMathInfo();
		student5.showMathInfo();
		
	}

}
