package array;

public class TwoDimension {

	public static void main(String[] args) {
		char [][] arr = new char [13][2];
		char ch = 'a';
						
		for (int i=0 ; i<arr.length ; i++) {
			for(int j=0; j<arr[i].length; j++, ch++) {
				arr[i][j] = ch;						
				System.out.print(arr[i][j]);	
			}
			System.out.println();	
		}				
	System.out.println(arr.length);
	System.out.println(arr[0].length);
	System.out.println(arr[1].length);
	
	}
	
}