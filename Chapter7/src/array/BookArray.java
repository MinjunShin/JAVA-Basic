package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("전자기학", "패러데이");
		library[1] = new Book("회로이론", "키르만호프");
		library[2] = new Book("전력공학", "예담사");
		library[3] = new Book("전기설비기준", "전기기술인협회");
		library[4] = new Book("전기설비판단기준", "전기안전공사");
		
		for(int i=0; i<library.length; i++) {
			library[i].showInfo();
		}
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}

	}

}
