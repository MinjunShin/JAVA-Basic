package Constructor;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personKim = new Person();
		
		personKim.name = "������";
		personKim.height = 85.5F;
		personKim.weight = 180.0F;
		
		Person PersonLee = new Person("�̼���", 175, 75);
		
		System.out.println(PersonLee.name);
		System.out.println(personKim.name);

	}

}
