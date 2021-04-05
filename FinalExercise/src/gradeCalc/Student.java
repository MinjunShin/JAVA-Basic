package gradeCalc;

import java.util.ArrayList;

public class Student {

	private String name;
	private String id;
	private String major;
	private String essentialSub;
	private ArrayList<Subject> subject;
	private Subject sub_main;
	
	public Student(String name, String id, String major) {
		this.name = name;
		this.id = id;
		this.major = major;
		subject = new ArrayList<Subject>();
		sub_main = new Subject();

	}
	
	void addScoreData(String subName, int subScore) {	
		sub_main = new Subject();
		sub_main.setSubName(subName);
		sub_main.setSubScore(subScore);
		subject.add(sub_main);
				
		if(Isessential(sub_main.getSubName()) == true) {
			sub_main.c_gradeCalc(subScore);
			
		}
		
		else if(Isessential(sub_main.getSubName()) == false) {
			sub_main.e_gradeCalc(subScore);
			
		}
		
		
	}
	
	boolean Isessential(String subName) {
		
		if(major == "국어국문학과") {
			essentialSub = "국어";
		}
		
		if(major == "컴퓨터공학과") {
			essentialSub = "수학";
		}		
		
		if(subName == this.essentialSub) {
			return true;
		}
		
		else return false;
	}
	
	
	void showIndivInfo() {
		for(Subject s : subject) {
			System.out.println("이름 : " + name + " | 학번 : " + id +"| 과목 : " + s.getSubName() + 
					"| 점수 : " + s.getSubScore() + "|학점 : " + s.getGradeResult());
		}
	}
	
	
	void showAllInfo() {
		for(Subject s : subject) {
		System.out.println("이름 : " + name + " | 학번 : " + id + "| 전공과목 : " + major + "| 필수과목 : " + essentialSub + "| 과목 : " + s.getSubName() + "| 점수 : " + s.getSubScore()); 
	
		}
	}
	
	
	void showKoreanInfoHeader() {		
		System.out.println("-------------------------------------");		
		System.out.println("            국어 수강생 학점          ");
		System.out.println(" 이름 |  학     번  | 중점과목 |   점수");
		System.out.println("-------------------------------------");
	}
	
	void showKoreanInfo() {
		
		subject.stream().filter(c->c.getSubName() == "국어").
		forEach(s->System.out.println( name + " | " + id + " |  "
				+ essentialSub + "  | " + s.getSubScore() + " : " + s.getGradeResult()));		
		
	}
	
	void showMathInfoHeader() {		
		System.out.println("-------------------------------------");		
		System.out.println("            수학 수강생 학점          ");
		System.out.println(" 이름 |  학     번  | 중점과목 |   점수");
		System.out.println("-------------------------------------");
	}
	
	void showMathInfo() {
		subject.stream().filter(c->c.getSubName() == "수학").
		forEach(s->System.out.println( name + " | " + id + " |  "
				+ essentialSub + "  | " + s.getSubScore() + " : " + s.getGradeResult()));		
		
	}
	
}

