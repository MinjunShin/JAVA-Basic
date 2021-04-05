package exception;

public class IDformatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDformatException {
		if(userID == null) {
			throw new IDformatException("아이디는 null일 수 없습니다.");
		}
		else if(userID.length() > 20 || userID.length() < 8) {
			throw new IDformatException("아이디는 8자 이상 20자 이하로 쓰시오.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDformatTest test = new IDformatTest();
		String userID = null;
		
		try {
			test.setUserID(userID);
		} catch(IDformatException e) {
			System.out.println(e.getMessage());
		} 
		
		userID = "12345";
		
		try {
			test.setUserID(userID);
		} catch(IDformatException e) {
			System.out.println(e.getMessage());
		} 		

	}

}
