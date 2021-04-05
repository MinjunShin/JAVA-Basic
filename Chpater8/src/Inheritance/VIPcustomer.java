package Inheritance;

public class VIPcustomer extends Customer {
	private int VIPID;
	double saleRatio;
	private int agentID;
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);		
	}
	
	
	
	public VIPcustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP"; // customerGrade�� private�����̹Ƿ� �����߻�
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIP ������ ȣ��");
	}

	public int getVIPID() {
		return VIPID;
	}
	
	public String showVIPinfo() {
		return super.ShowInfo() + "��� ���� ID��" + agentID + "�̴�." ;
		
	}
}
