package exArrayList;

import java.util.ArrayList;

public class Student {

	int StudentID;
	String StudentName;
	ArrayList<Subject> subjectList;
		
	public Student(int ID, String Name) {
		this.StudentID = ID;
		this.StudentName = Name;
		subjectList = new ArrayList<Subject>();		
	}
	
	public void addSubject (String name, int score) {
		Subject subject = new Subject(); // Subject �����ϱ�
		subject.setName(name); // �����̸� �߰��ϱ�
		subject.setScore(score); // ���� �߰��ϱ�
		subjectList.add(subject); // �迭�� �����ϱ�
	}
	
	public void ShowInfo() {
		int total = 0;
		int average = 0;
		for(Subject s : subjectList) {
			total += s.getScore(); // ���� ���ϱ�
			average = total/subjectList.size();
			System.out.println("�л�" + StudentName + "��" +  s.getName() +"������" + s.getScore());
		}
		System.out.println("������" + total);
		System.out.println("�����" + average);		
		
	}

}
