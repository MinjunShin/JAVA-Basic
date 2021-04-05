package Constructor;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personKim = new Person();
		
		personKim.name = "김유신";
		personKim.height = 85.5F;
		personKim.weight = 180.0F;
		
		Person PersonLee = new Person("이순신", 175, 75);
		
		System.out.println(PersonLee.name);
		System.out.println(personKim.name);

	}

}
