package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) throws IOException {

		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� �����ÿ�.");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
