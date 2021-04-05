package collection.arraylist;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<>();
	
	public void push(String data) {
		arrayStack.add(data);
		// 스택 맨 뒤 요소를 추가
	}
	
	public String pop() {
		int len = arrayStack.size();
		//arrayList에 저장된 유요한 자료의 개수
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return(arrayStack.remove(len-1));
		//맨 뒤에 있는 자료 반환하고 배열에서 제거
	}
}

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
