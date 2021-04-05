package stream;

import java.util.List;
import java.util.ArrayList;

class Book { 
	private String name;
	private int price;

	public Book(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

public class LibraryTest {
	public static void main(String[] args){
		List<Book> bookList = new ArrayList();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		int total = bookList.stream().mapToInt(s->s.getPrice()).sum();
		System.out.println(total);
		
		bookList.stream().filter(s-> s.getPrice()>= 20000).map(c->c.getName()).sorted().forEach(v->System.out.println(v));
				
		}
}