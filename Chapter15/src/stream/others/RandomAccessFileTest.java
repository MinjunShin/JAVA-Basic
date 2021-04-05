package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		// 파일 포인터위치를 반환하는 메서드 사용
		rf.writeDouble(3.14);
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		rf.writeUTF("안녕~?");
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());

		rf.seek(0);
		System.out.println("파일 포인터 위치 초기화 : " + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();

		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		// 읽기가 끝난 후 파일 포인터 위치 출력
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		}
}