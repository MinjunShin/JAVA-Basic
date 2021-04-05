package Person;

public class PersonInfo {

	int Age;
	String Name;
	boolean Marrige;
	int childCount;
	
	
	public static void main(String[] args) {
		
		PersonInfo James = new PersonInfo();
		
		James.Age = 40;
		James.Name = "James";
		James.Marrige = true;
		James.childCount = 3;
		
		System.out.println(James.Age);
		System.out.println(James.Name);
		System.out.println(James.Marrige);
		System.out.println(James.childCount);
		
		
	}

}
