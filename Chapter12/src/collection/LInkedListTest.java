package collection;

import java.util.LinkedList;

public class LInkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<> ();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		//����Ʈ ��ü ���
		
		myList.add(1, "D");
		//ù��° ��ġ�� D�߰�
		System.out.println(myList);
		
		myList.addFirst("E");
		//���Ḯ��Ʈ�� �� �տ� E �߰�
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		//���Ḯ��Ʈ�� �� �� ��Ҹ� ����� �ش� ��Ҹ� ���
		
		System.out.println(myList);
		
	}

}
