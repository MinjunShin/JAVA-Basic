package bookshelf;

public class Bookshelf extends Shelf implements Quene {

	@Override
	public void enQuene(String title) {
		shelf.add(title); //�迭�� ��� �߰�
		
	}

	@Override
	public String deQuene() {
		return shelf.remove(0);
		//�� ó�� ��Ҹ� �迭���� �����ϰ� ��ȯ
	}

	@Override
	public int getSize() {		
		return getCount();
		//�迭 ��Ұ��� ��ȯ
	}

	
}
