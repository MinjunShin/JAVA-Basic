package cooperation;

public class Subway {
	String subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(String subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("����"+subwayNumber+"���� �°���"+passengerCount+"���̰�, ������"+money);
	}
	
	
}