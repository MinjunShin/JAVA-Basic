package chapter2;

public class Variable1 {
	public static void main(String[] args) {		
		
		for(int i = 1; i <= 10 ; i++) {
			boolean jjak = (i % 2 == 0 ? true : false);
			System.out.println(i + " 는 짝수 입니까? " + jjak);
		}
		
	}	
}


//* : 1 -> 3 -> 5 -> 7
//' ' : 3 -> 2 -> 1 -> 0 


// 0 1 2 3 : i
// 1 3 5 7 : star
// 1 2 3 4 
// i * 2 + 1