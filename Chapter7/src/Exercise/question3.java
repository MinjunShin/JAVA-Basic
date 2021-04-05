package Exercise;

public class question3 {
	
	public static void main(String[] args) {
	
		int [] array = new int[] {2,4,6,8,10};
		int sum = 0;
	
		for(int i : array) {						
			sum += i;
		}
		System.out.println(sum);	
	}

}