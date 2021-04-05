package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cust = new Customer();

		Buy buyer = cust;
		buyer.buy();
		//Customer Ŭ������ cust�� Buy������ ����ȯ.
		//cust�� Buy �������̽��� �޼��常 ȣ�� ����.
		
		Sell seller = cust;
		seller.sell();
		//Customer Ŭ������ cust�� Sell������ ����ȯ.
		//cust�� Sell �������̽��� �޼��常 ȣ�� ����.
		
		if(seller instanceof Customer) {
			Customer cust2 = (Customer)seller;
			//seller�� ���� Ŭ������ Customer ������ �ٽ� �� ��ȯ
			cust2.buy();
			cust2.sell();
		}
	}

}
