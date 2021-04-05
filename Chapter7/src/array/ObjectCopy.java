package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[3];
		Book[] library2 = new Book[3];		
		
		library[0] = new Book("전자기학", "패러데이");
		library[1] = new Book("회로이론", "키르만호프");
		library[2] = new Book("전력공학", "예담사");
		System.arraycopy(library, 0, library2, 0, 3);
		
		for(int i=0; i<library2.length; i++) {
			library2[i].showInfo();
		}

	}

}
