package Inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerPark = new Customer(10010, "HY");
		VIPcustomer customerShin = new VIPcustomer(10020, "MJ", 12345);
		
		customerPark.bonusPoint = 1000;
		customerShin.bonusPoint = 10000;
		
		int price = 10000;
		
		System.out.println(customerPark.getCustomerName()+"�� ���� �ݾ���"
		+customerPark.calcPrice(price));
		
		System.out.println(customerShin.getCustomerName()+"�� ���� �ݾ���"
		+customerShin.calcPrice(price));
		
	}

}
