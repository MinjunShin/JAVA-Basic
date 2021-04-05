package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
	
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("Reader.txt")) {
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) !=-1) {
				for(int b=0; b<i; b++){
					System.out.print((char)bs[b]);
				}
				System.out.println(":" + i + "바이트 읽음");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
