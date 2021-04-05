package Inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
	
		int price = 10000;
		
		Customer customerPark = new Customer(10010, "HY");
		VIPcustomer customerShin = new VIPcustomer(10020, "MJ", 12345);
		Customer vc = new VIPcustomer(10030, "Unknown", 12346);
			
		System.out.println(customerPark.getCustomerName()+"의 지불 금액은"
		+customerPark.calcPrice(price));
		
		System.out.println(customerShin.getCustomerName()+"의 지불 금액은"
		+customerShin.calcPrice(price));
		
		System.out.println(vc.getCustomerName()+"의 지불 금액은"
		+vc.calcPrice(price));		
		
	}
}
