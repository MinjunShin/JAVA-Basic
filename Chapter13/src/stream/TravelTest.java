package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer CustomerPark = new TravelCustomer("HY", 40, 100);
		TravelCustomer CustomerShin = new TravelCustomer("MJ", 20, 100);
		TravelCustomer CustomerKim = new TravelCustomer("AB", 13, 50);

		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(CustomerPark);
		customerList.add(CustomerShin);
		customerList.add(CustomerKim);
		
		System.out.println("===�� ��� �߰��� ������� ���===");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("���� �� ����� : " + total);
		
		System.out.println("===20�� �̻� �� ��� ���ĵ� ���·� ���===");
		customerList.stream().filter(s->s.getAge()>=20).map(v->v.getName()).sorted().forEach(c->System.out.println(c));		
	}

}
