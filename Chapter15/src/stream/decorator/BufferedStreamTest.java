package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
		FileOutputStream fos = new FileOutputStream("copy.zip");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			millisecond = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}			
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(millisecond + "만큼 소요되었습니다.");
	
	}

}
