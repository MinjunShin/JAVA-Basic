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
		System.out.println("버스"+subwayNumber+"번의 승객은"+passengerCount+"명이고, 수입은"+money);
	}
	
	
}