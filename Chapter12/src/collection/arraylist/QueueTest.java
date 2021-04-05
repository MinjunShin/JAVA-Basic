package collection.arraylist;

import java.util.ArrayList;


class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<> ();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return arrayQueue.remove(0);
		//맨앞의 자료 반환하고 배열에서 제거
	}
	
	public void showAllList() {
		for(int i=0; i<arrayQueue.size(); i++) {
			System.out.println(arrayQueue.get(i));
		}
	}

}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println("===리스트 전체 출력===");
		queue.showAllList();
		System.out.println("===리스트 삭제 재시작===");
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
