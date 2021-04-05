package exception;

public class PasswordException {
	
	private String pass;
	
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) throws IDformatException {
		if (pass == null) {
			throw new IDformatException("��й�ȣ�� null�ϼ� ����."); 
		}
		else if(pass.matches("[a-zA-Z]+")==true) {
			throw new IDformatException("��й�ȣ�� ���ڿ��θ� �̷���� �� �����ϴ�.");
		}
		else if(pass.length() < 6) {
			throw new IDformatException("��й�ȣ�� 5�ڸ� �Ѿ�� �մϴ�.");
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
