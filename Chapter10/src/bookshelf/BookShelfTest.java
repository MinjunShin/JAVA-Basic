package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quene shelfQuene = new Bookshelf();
		
		shelfQuene.enQuene("전자기학1");
		shelfQuene.enQuene("전자기학2");
		shelfQuene.enQuene("전자기학3");
		
		System.out.println(shelfQuene.deQuene());
		//배열의 요소를 순서대로 출력
		System.out.println(shelfQuene.deQuene());
		System.out.println(shelfQuene.deQuene());

	}

}
