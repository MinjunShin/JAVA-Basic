package thisex;

class Person {
	String name;
	int age;
		
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person( ) {
		this("이름없음", 1);
	}
	
	Person returnItself() {
		return this;
	}
	
}


public class CallAnotherConst {

	public static void main(String[] args) {
		Person Noname = new Person();
		System.out.println(Noname.name);
		System.out.println(Noname.age);
		
		Person p = Noname.returnItself();
		System.out.println(p);
		System.out.println(Noname);

	}

}
