package Exercise;

import java.util.ArrayList;

public class question4Test {

	public static void main(String[] args) {
		
	ArrayList<question4> Dog = new ArrayList<question4>();
	
	Dog.add(new question4("���1", "������"));
	Dog.add(new question4("���2", "������"));
	Dog.add(new question4("���3", "������"));
	Dog.add(new question4("���4", "������"));
	Dog.add(new question4("���5", "������"));
	
	for(question4 array : Dog) {
		
		System.out.println(array.ShowInfo());
		
	}

  }
}
