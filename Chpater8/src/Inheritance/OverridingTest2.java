package Inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
	
		int price = 10000;
		
		Customer customerPark = new Customer(10010, "HY");
		VIPcustomer customerShin = new VIPcustomer(10020, "MJ", 12345);
		Customer vc = new VIPcustomer(10030, "Unknown", 12346);
			
		System.out.println(customerPark.getCustomerName()+"�� ���� �ݾ���"
		+customerPark.calcPrice(price));
		
		System.out.println(customerShin.getCustomerName()+"�� ���� �ݾ���"
		+customerShin.calcPrice(price));
		
		System.out.println(vc.getCustomerName()+"�� ���� �ݾ���"
		+vc.calcPrice(price));		
		
	}
}
