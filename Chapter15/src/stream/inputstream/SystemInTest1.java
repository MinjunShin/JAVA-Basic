package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) throws IOException {

		System.out.println("알파벳 하나를 쓰로 [Enter]를 누르시오.");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
