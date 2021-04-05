package Exercise;

import java.util.ArrayList;

public class question4Test {

	public static void main(String[] args) {
		
	ArrayList<question4> Dog = new ArrayList<question4>();
	
	Dog.add(new question4("비글1", "강아지"));
	Dog.add(new question4("비글2", "강아지"));
	Dog.add(new question4("비글3", "강아지"));
	Dog.add(new question4("비글4", "강아지"));
	Dog.add(new question4("비글5", "강아지"));
	
	for(question4 array : Dog) {
		
		System.out.println(array.ShowInfo());
		
	}

  }
}
