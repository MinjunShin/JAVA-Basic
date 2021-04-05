package innerClass;


class OutClass{
	private int Num = 10;
	private static int sNum = 20;
	
	static class InStaticClass { //���� ���� Ŭ����
		int inNum = 100; //���� ���� Ŭ������ �ν��Ͻ� ����
		static int sInNum = 200; // ���� ���� Ŭ������ ���� ����
		
		void inTest() {
			//Num += 10; �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			System.out.println("InStaticClass inNum=" + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���");
			System.out.println("InStaticClass sInNum=" + sInNum + "(���� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum=" + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			}
		
		static void sTest() {
			System.out.println("OutClass sNum=" + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNum=" + sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
	}
}



public class InnerTest {

	public static void main(String[] args) {
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		//�ܺ� Ŭ������ �������� �ʰ� �ٷ� ���� ���� Ŭ���� ���� ����.
		System.out.println("�ܺ�Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();
	}

}
