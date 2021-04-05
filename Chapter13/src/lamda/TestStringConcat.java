package lamda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
	
		StringConcat cat2 = (s,v) -> System.out.println(s1 + "," +s2);
		cat2.makeString(s1, s2);
	}

}
