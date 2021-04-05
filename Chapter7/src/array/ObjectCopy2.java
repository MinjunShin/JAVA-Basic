package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("전자기학", "패러데이");
		bookArray1[1] = new Book("회로이론", "키르만호프");
		bookArray1[2] = new Book("전력공학", "예담사");
		
		bookArray2[0] = new Book( ); // 디폴트 생성자로 bookArray2 인스턴스 생성
		bookArray2[1] = new Book( );
		bookArray2[2] = new Book( );
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
	}

}
