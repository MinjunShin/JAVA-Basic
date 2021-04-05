package array;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("���ڱ���", "�з�����"));
		library.add(new Book("ȸ���̷�", "Ű����ȣ��"));
		library.add(new Book("���°���", "�����"));
		library.add(new Book("���⼳�����", "����������ȸ"));
		library.add( new Book("���⼳���Ǵܱ���", "�����������"));
		
		for (int i=0; i<library.size(); i++) { //�迭�� �߰��� ��Ұ�����ŭ ���
			Book book = library.get(i);
			book.showInfo();					
		}		
		System.out.println();
		
		System.out.println("===���� for�� ���===");
		for(Book book : library) {
			book.showInfo();
		}
	

	}
	
}

