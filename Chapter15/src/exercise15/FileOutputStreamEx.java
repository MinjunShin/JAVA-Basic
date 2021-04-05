package exercise15;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.FileReader;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"))) {
			 
			osw.write("���ݱ��� ��ſ����~");			
		
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileReader fr = new FileReader("a.txt")){
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}		
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
}
