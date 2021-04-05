package exception;

public class IDformatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDformatException {
		if(userID == null) {
			throw new IDformatException("���̵�� null�� �� �����ϴ�.");
		}
		else if(userID.length() > 20 || userID.length() < 8) {
			throw new IDformatException("���̵�� 8�� �̻� 20�� ���Ϸ� ���ÿ�.");
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
