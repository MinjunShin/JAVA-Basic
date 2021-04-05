package gradeCalc;

public class Essen_grdStandard implements grdStandard {

	private int point;
	private char gradeResult;
	
	
	public void gradeCalc(int score) {
				
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


}

