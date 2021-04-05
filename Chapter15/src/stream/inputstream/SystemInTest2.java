package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르시오.");
		
		int i;
		try {
			while((i=System.in.read()) != -1) {
			//while 문에서 read()메서드로 한 바이트를 반복하여 읽음.
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
