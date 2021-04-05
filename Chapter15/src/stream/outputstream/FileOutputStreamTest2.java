package stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output2.txt");
		try(fos) {
			byte[] bs = new byte[26];
			byte data = 65; //'A'의 아스키 코드값
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 3, 10);
		} catch (IOException e) {
		e.printStackTrace();
	}
		
 }
	
}
