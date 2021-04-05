package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("���� ������ ��ġ : " + rf.getFilePointer());
		// ���� ��������ġ�� ��ȯ�ϴ� �޼��� ���
		rf.writeDouble(3.14);
		System.out.println("���� ������ ��ġ : " + rf.getFilePointer());
		rf.writeUTF("�ȳ�~?");
		System.out.println("���� ������ ��ġ : " + rf.getFilePointer());

		rf.seek(0);
		System.out.println("���� ������ ��ġ �ʱ�ȭ : " + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();

		System.out.println("���� ������ ��ġ : " + rf.getFilePointer());
		// �бⰡ ���� �� ���� ������ ��ġ ���
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		}
}