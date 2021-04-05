package exception;

public class PasswordException {
	
	private String pass;
	
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) throws IDformatException {
		if (pass == null) {
			throw new IDformatException("비밀번호는 null일수 없다."); 
		}
		else if(pass.matches("[a-zA-Z]+")==true) {
			throw new IDformatException("비밀번호는 문자열로만 이루어질 수 없습니다.");
		}
		else if(pass.length() < 6) {
			throw new IDformatException("비밀번호는 5자를 넘어야 합니다.");
		}
		
		this.pass = pass;
	}



	public static void main(String[] args) {
		PasswordException test = new PasswordException();
		String passWord = null;

		try {
			test.setPass(passWord);
		} catch(IDformatException e) {
			System.out.println(e.getMessage());
		} 
		
		passWord = "abc";
		
		try {
			test.setPass(passWord);
		} catch(IDformatException e) {
			System.out.println(e.getMessage());
		}
		
		passWord = "abc12";
		try {
			test.setPass(passWord);
		} catch(IDformatException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
