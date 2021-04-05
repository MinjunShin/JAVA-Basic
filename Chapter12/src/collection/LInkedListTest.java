package collection;

import java.util.LinkedList;

public class LInkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<> ();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		//리스트 전체 출력
		
		myList.add(1, "D");
		//첫번째 위치에 D추가
		System.out.println(myList);
		
		myList.addFirst("E");
		//연결리스트의 맨 앞에 E 추가
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		//연결리스트의 맨 뒤 요소를 지우고 해당 요소를 출력
		
		System.out.println(myList);
		
	}

}
