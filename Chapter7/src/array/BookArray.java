package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("���ڱ���", "�з�����");
		library[1] = new Book("ȸ���̷�", "Ű����ȣ��");
		library[2] = new Book("���°���", "�����");
		library[3] = new Book("���⼳�����", "����������ȸ");
		library[4] = new Book("���⼳���Ǵܱ���", "�����������");
		
		for(int i=0; i<library.length; i++) {
			library[i].showInfo();
		}
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}

	}

}
