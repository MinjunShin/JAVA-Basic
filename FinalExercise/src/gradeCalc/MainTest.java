package gradeCalc;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("���Ͽ�", "2016217211", "������а�");
		Student student2 = new Student("�Ź���", "2019611017", "��ǻ�Ͱ��а�");
		Student student3 = new Student("�ȼ���", "2019211013", "������а�");
		Student student4 = new Student("������", "2019213015", "������а�");
		Student student5 = new Student("�̵�ȣ", "2019611166", "��ǻ�Ͱ��а�");
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		student1.addScoreData("����", 95);
		student1.addScoreData("����", 56);
		
		student2.addScoreData("����", 95);
		student2.addScoreData("����", 98);
		
		student3.addScoreData("����", 100);
		student3.addScoreData("����", 88);
		
		student4.addScoreData("����", 89);
		student4.addScoreData("����", 98);
		
		student5.addScoreData("����", 83);
		student5.addScoreData("����", 56);
		
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
