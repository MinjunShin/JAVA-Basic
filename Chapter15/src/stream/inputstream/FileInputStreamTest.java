package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest{
	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("Reader.txt")){
			int i;
			while((i = fis.read()) != -1){
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
		
}