package staticex;

public class Student3 {
	static int SerialNo = 2021100;
	static int CardNo;
	String StudentName;
	public int StudentNum;
	public int StudentCardNo;
	
	public Student3() {
		SerialNo++;
		//StudentNum = SerialNo;
		
		CardNo = SerialNo + 100;
		//StudentCardNo = CardNo;
	
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	
}
