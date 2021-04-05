package collection;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("HY");
		set.add("MJ");
		set.add("AB");
		set.add("HY");
		
		System.out.println(set);
	}

}
