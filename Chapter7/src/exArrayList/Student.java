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
		Subject subject = new Subject(); // Subject 생성하기
		subject.setName(name); // 과목이름 추가하기
		subject.setScore(score); // 점수 추가하기
		subjectList.add(subject); // 배열에 저장하기
	}
	
	public void ShowInfo() {
		int total = 0;
		int average = 0;
		for(Subject s : subjectList) {
			total += s.getScore(); // 총점 더하기
			average = total/subjectList.size();
			System.out.println("학생" + StudentName + "의" +  s.getName() +"성적은" + s.getScore());
		}
		System.out.println("총점은" + total);
		System.out.println("평균은" + average);		
		
	}

}
