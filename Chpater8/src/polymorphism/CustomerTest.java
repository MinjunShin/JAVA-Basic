package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerPark = new Customer();
		customerPark.setCustomerID(10010);
		customerPark.setCustomerName("HY");
		customerPark.bonusPoint = 1000;
		
		System.out.println(customerPark.ShowInfo());
		
		Customer customerShin = new VIPcustomer(10020, "MJ", 12345);
		customerShin.bonusPoint = 1000;
		
		System.out.println(customerShin.ShowInfo());
		System.out.println("===�������� ���ʽ� ����Ʈ ���===");
		
		int price = 10000;
		int ParkPrice = customerPark.calcPrice(price);
		int ShinPrice = customerShin.calcPrice(price);
		System.out.println(customerPark.getCustomerName() + "����" + ParkPrice + "�� ����");
		System.out.println(customerPark.ShowInfo());
		System.out.println(customerShin.getCustomerName() + "����" + ShinPrice + "�� ����");
		System.out.println(customerShin.ShowInfo());
	}

}
