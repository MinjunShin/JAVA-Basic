package innerClass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable (int i) {
		int num = 100;
		
		class MyRunnable implements Runnable { // 지역 내부 클래스
			int localNum = 10; // 지역 내부 클래스의 인스턴스 변수
			@Override
			public void run() {
				//num = 200; 지역변수는 상수로 바뀌므로 값을 변경할 수 없음.
				//i = 100; 매개 변수 또한 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
				System.out.println("i=" + i);
				System.out.println("num=" + num);
				System.out.println("localNum=" + localNum);
				System.out.println("OutNum=" + outNum + "(외부인스턴스 변수)");
				System.out.println("Outer.sNum=" + Outer.sNum+ "(외부 클래스 정적변수)");
				
			}			
		}
		return new MyRunnable();
	}
}


public class LocalInnerTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}
