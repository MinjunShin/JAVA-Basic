package array;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {}
	
	public Book(String bookName1, String author1) {
		this.bookName = bookName1;
		this.author = author1;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(bookName + "," + author);
	}	
	
}
