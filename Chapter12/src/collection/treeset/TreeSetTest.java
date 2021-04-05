package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("홍길동");
		treeSet.add("김유신");
		treeSet.add("신사임당");
		
		for(String str : treeSet) {
			System.out.println(str);
		}

	}

}
