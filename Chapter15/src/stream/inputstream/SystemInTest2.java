package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("���ĺ� �������� ���� [Enter]�� �����ÿ�.");
		
		int i;
		try {
			while((i=System.in.read()) != -1) {
			//while ������ read()�޼���� �� ����Ʈ�� �ݺ��Ͽ� ����.
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
