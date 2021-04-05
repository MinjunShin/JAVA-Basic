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
			System.out.println("������ ������ϴ�.");
			return null;
		}
		
		return arrayQueue.remove(0);
		//�Ǿ��� �ڷ� ��ȯ�ϰ� �迭���� ����
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
		System.out.println("===����Ʈ ��ü ���===");
		queue.showAllList();
		System.out.println("===����Ʈ ���� �����===");
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
