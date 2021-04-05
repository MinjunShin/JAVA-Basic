package bookshelf;

public class Bookshelf extends Shelf implements Quene {

	@Override
	public void enQuene(String title) {
		shelf.add(title); //배열에 요소 추가
		
	}

	@Override
	public String deQuene() {
		return shelf.remove(0);
		//맨 처음 요소를 배열에서 삭제하고 반환
	}

	@Override
	public int getSize() {		
		return getCount();
		//배열 요소개수 반환
	}

	
}
