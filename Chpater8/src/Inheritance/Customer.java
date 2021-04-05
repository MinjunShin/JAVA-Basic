package Inheritance;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER"; // 기본등급
		bonusRatio = 0.01; // 기본 적립 비율
		System.out.println("Customer 생성자 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;		
	}
	
	public String ShowInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스포인트는"
				+ bonusPoint + "입니다.";
				
	}
}
