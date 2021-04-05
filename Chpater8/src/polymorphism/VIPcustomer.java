package polymorphism;

public class VIPcustomer extends Customer {
	private int VIPID;
	double saleRatio;
	private int agentID;
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);		
	}
	
	
	
	public VIPcustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP"; // customerGrade가 private변수이므로 오류발생
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIP 생성자 호출");
	}

	public int getVIPID() {
		return VIPID;
	}
	
	public String showInfo() {
		return super.ShowInfo() + "담당 상담원 ID는" + agentID + "이다." ;
		
	}
}