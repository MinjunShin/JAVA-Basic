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
	
	System.out.println("===�� ���� ���===");
	
	for(Customer List : CustomerList) {
		System.out.println(List.ShowInfo());		
	}
		
	System.out.println("===���� ���� ���===");
	
	for(Customer List : CustomerList) {
		int Price = 10000;
		int cost = List.calcPrice(Price);
		System.out.println(List.getCustomerGrade() + "��� " + List.getCustomerName() + "����"
				+ cost + "�� �����Ͽ����ϴ�.");
		System.out.println(List.getCustomerName() + "���� ���ʽ� ����Ʈ��" + List.bonusPoint + "�Դϴ�.");
		
	}

	}

}
