package Inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerPark = new Customer(10010, "HY");
		VIPcustomer customerShin = new VIPcustomer(10020, "MJ", 12345);
		
		customerPark.bonusPoint = 1000;
		customerShin.bonusPoint = 10000;
		
		int price = 10000;
		
		System.out.println(customerPark.getCustomerName()+"의 지불 금액은"
		+customerPark.calcPrice(price));
		
		System.out.println(customerShin.getCustomerName()+"의 지불 금액은"
		+customerShin.calcPrice(price));
		
	}

}
