package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("���ڱ���", "�з�����");
		bookArray1[1] = new Book("ȸ���̷�", "Ű����ȣ��");
		bookArray1[2] = new Book("���°���", "�����");
		
		bookArray2[0] = new Book( ); // ����Ʈ �����ڷ� bookArray2 �ν��Ͻ� ����
		bookArray2[1] = new Book( );
		bookArray2[2] = new Book( );
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
	}

}
