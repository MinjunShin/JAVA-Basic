package Inheritance;

import java. util.ArrayList;

public class CustomerList{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	ArrayList <Customer> CustomerList = new ArrayList<Customer>();
	
	Customer customerPark = new VIPcustomer(10010, "HY", 12345);
	Customer customerShin = new GoldCustomer(10020, "MJ");
	Customer customerKim = new GoldCustomer(10030, "AB");
	Customer customerJung = new Customer(10040, "CD");
	Customer customerYoo = new Customer(10050, "EF");
	
	CustomerList.add(customerPark);
	CustomerList.add(customerShin);
	CustomerList.add(customerKim);
	CustomerList.add(customerJung);
	CustomerList.add(customerYoo);
	
	System.out.println("===고객 정보 출력===");
	
	for(Customer List : CustomerList) {
		System.out.println(List.ShowInfo());		
	}
		
	System.out.println("===가격 정보 출력===");
	
	for(Customer List : CustomerList) {
		int Price = 10000;
		int cost = List.calcPrice(Price);
		System.out.println(List.getCustomerGrade() + "등급 " + List.getCustomerName() + "님이"
				+ cost + "원 지불하였습니다.");
		System.out.println(List.getCustomerName() + "님의 보너스 포인트는" + List.bonusPoint + "입니다.");
		
	}

	}

}
