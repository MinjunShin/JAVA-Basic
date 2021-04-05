package bookshelf;

public interface Quene {
	void enQuene(String title); //배열의 맨 마지막에 추가
	String deQuene(); // 배열의 맨 처음 항목 반환
	int getSize(); // 현재 Quene에 있는 개수 반환

}
