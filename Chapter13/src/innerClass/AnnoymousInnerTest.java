package innerClass;

class Outer2{
	Runnable getRunaable(int i) {
		int num = 100;
		
		return new Runnable() {
			// num = 200; ���� �߻�
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
		
	}
	
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable�� ������ �͸� Ŭ���� ����");
		}
	};
}

public class AnnoymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runner = out.getRunaable(10);
		runner.run();
		out.runner.run();

	}

}
