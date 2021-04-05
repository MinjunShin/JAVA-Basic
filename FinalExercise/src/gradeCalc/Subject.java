package gradeCalc;

public class Subject {

	private String subName;
	private int SubScore;
	
	private int point;
	private char gradeResult;
	
	
	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	public char getGradeResult() {
		return gradeResult;
	}


	public void setGradeResult(char gradeResult) {
		this.gradeResult = gradeResult;
	}


	public void c_gradeCalc(int score) {
		
		point = score;
			
		if( point >= 90 && point <= 100 ) {
			gradeResult = 'A';			
		}
		
		if( point >= 80 && point <= 89 ) {
			gradeResult = 'B';			
		}
		
		if( point >= 70 && point <= 79 ) {
			gradeResult = 'C';			
		}
		
		if( point >= 55 && point <= 69 ) {
			gradeResult = 'D';			
		}
		
		if( point < 55 ) {
			gradeResult = 'F';			
		}
		
	}
	
	public void e_gradeCalc(int score) {
		
		point = score;
				
		if( point >= 95 && point <= 100 ) {
			gradeResult = 'S';			
		}
		
		if( point >= 90 && point <= 94 ) {
			gradeResult = 'A';			
		}
		
		if( point >= 80 && point <= 89 ) {
			gradeResult = 'B';			
		}
		
		if( point >= 70 && point <= 79 ) {
			gradeResult = 'C';			
		}
		
		if( point >= 60 && point <= 69 ) {
			gradeResult = 'D';			
		}
		
		if( point < 60 ) {
			gradeResult = 'F';			
		}
		
		
	}


		
	public Subject(String subName, int subScore) {
		// TODO Auto-generated constructor stub
		this.subName = subName;
		this.SubScore = subScore;
	}
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}
	
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public int getSubScore() {
		return SubScore;
	}
	public void setSubScore(int subScore) {
		SubScore = subScore;
	}	
	
	
	
}
