package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quene shelfQuene = new Bookshelf();
		
		shelfQuene.enQuene("���ڱ���1");
		shelfQuene.enQuene("���ڱ���2");
		shelfQuene.enQuene("���ڱ���3");
		
		System.out.println(shelfQuene.deQuene());
		//�迭�� ��Ҹ� ������� ���
		System.out.println(shelfQuene.deQuene());
		System.out.println(shelfQuene.deQuene());

	}

}
