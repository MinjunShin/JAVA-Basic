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
		
		System.out.println("===고객 명단 추가된 순서대로 출력===");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("여행 총 비용은 : " + total);
		
		System.out.println("===20세 이상 고객 명단 정렬된 상태로 출력===");
		customerList.stream().filter(s->s.getAge()>=20).map(v->v.getName()).sorted().forEach(c->System.out.println(c));		
	}

}
