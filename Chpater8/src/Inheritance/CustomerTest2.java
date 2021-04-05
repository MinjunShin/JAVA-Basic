package Inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		VIPcustomer customerShin = new VIPcustomer(10020, "MJ", 10021);
		//customerShin.setCustomerID(10020);
		//customerShin.setCustomerName("MJ");
		customerShin.bonusPoint = 5000;
		System.out.println(customerShin.ShowInfo());
	}

}