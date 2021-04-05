package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cust = new Customer();

		Buy buyer = cust;
		buyer.buy();
		//Customer 클래스인 cust를 Buy형으로 형변환.
		//cust는 Buy 인터페이스의 메서드만 호출 가능.
		
		Sell seller = cust;
		seller.sell();
		//Customer 클래스인 cust를 Sell형으로 형변환.
		//cust는 Sell 인터페이스의 메서드만 호출 가능.
		
		if(seller instanceof Customer) {
			Customer cust2 = (Customer)seller;
			//seller를 하위 클래스인 Customer 형으로 다시 형 변환
			cust2.buy();
			cust2.sell();
		}
	}

}
