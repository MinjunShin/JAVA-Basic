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
		
		if(major == "������а�") {
			essentialSub = "����";
		}
		
		if(major == "��ǻ�Ͱ��а�") {
			essentialSub = "����";
		}		
		
		if(subName == this.essentialSub) {
			return true;
		}
		
		else return false;
	}
	
	
	void showIndivInfo() {
		for(Subject s : subject) {
			System.out.println("�̸� : " + name + " | �й� : " + id +"| ���� : " + s.getSubName() + 
					"| ���� : " + s.getSubScore() + "|���� : " + s.getGradeResult());
		}
	}
	
	
	void showAllInfo() {
		for(Subject s : subject) {
		System.out.println("�̸� : " + name + " | �й� : " + id + "| �������� : " + major + "| �ʼ����� : " + essentialSub + "| ���� : " + s.getSubName() + "| ���� : " + s.getSubScore()); 
	
		}
	}
	
	
	void showKoreanInfoHeader() {		
		System.out.println("-------------------------------------");		
		System.out.println("            ���� ������ ����          ");
		System.out.println(" �̸� |  ��     ��  | �������� |   ����");
		System.out.println("-------------------------------------");
	}
	
	void showKoreanInfo() {
		
		subject.stream().filter(c->c.getSubName() == "����").
		forEach(s->System.out.println( name + " | " + id + " |  "
				+ essentialSub + "  | " + s.getSubScore() + " : " + s.getGradeResult()));		
		
	}
	
	void showMathInfoHeader() {		
		System.out.println("-------------------------------------");		
		System.out.println("            ���� ������ ����          ");
		System.out.println(" �̸� |  ��     ��  | �������� |   ����");
		System.out.println("-------------------------------------");
	}
	
	void showMathInfo() {
		subject.stream().filter(c->c.getSubName() == "����").
		forEach(s->System.out.println( name + " | " + id + " |  "
				+ essentialSub + "  | " + s.getSubScore() + " : " + s.getGradeResult()));		
		
	}
	
}

