package array;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("전자기학", "패러데이"));
		library.add(new Book("회로이론", "키르만호프"));
		library.add(new Book("전력공학", "예담사"));
		library.add(new Book("전기설비기준", "전기기술인협회"));
		library.add( new Book("전기설비판단기준", "전기안전공사"));
		
		for (int i=0; i<library.size(); i++) { //배열에 추가된 요소개수만큼 출력
			Book book = library.get(i);
			book.showInfo();					
		}		
		System.out.println();
		
		System.out.println("===향상된 for문 사용===");
		for(Book book : library) {
			book.showInfo();
		}
	

	}
	
}

