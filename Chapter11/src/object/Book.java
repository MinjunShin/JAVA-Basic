package object;

public class Book {
	int bookNum;
	String bookName;
	
	Book(int Num, String Name){
		this.bookNum = Num;
		this.bookName = Name;
	}

	@Override
	public String toString() {
		
		return bookName + "," + bookNum;
	}
	
	public static void main(String[] args) {
		
		Book book1 = new Book(200, "°³ºñ");
		System.out.println(book1.toString());
		
	}
	
}


