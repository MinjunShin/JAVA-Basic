package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[3];
		Book[] library2 = new Book[3];		
		
		library[0] = new Book("���ڱ���", "�з�����");
		library[1] = new Book("ȸ���̷�", "Ű����ȣ��");
		library[2] = new Book("���°���", "�����");
		System.arraycopy(library, 0, library2, 0, 3);
		
		for(int i=0; i<library2.length; i++) {
			library2[i].showInfo();
		}

	}

}
