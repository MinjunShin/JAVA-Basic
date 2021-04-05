package innerClass;


class OutClass{
	private int Num = 10;
	private static int sNum = 20;
	
	static class InStaticClass { //정적 내부 클래스
		int inNum = 100; //정적 내부 클래스의 인스턴스 변수
		static int sInNum = 200; // 정적 내부 클래스의 정적 변수
		
		void inTest() {
			//Num += 10; 외부 클래스의 인스턴스 변수는 사용할 수 없다
			System.out.println("InStaticClass inNum=" + inNum + "(내부 클래스의 인스턴스 변수 사용");
			System.out.println("InStaticClass sInNum=" + sInNum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum=" + sNum + "(외부 클래스의 정적 변수 사용)");
			}
		
		static void sTest() {
			System.out.println("OutClass sNum=" + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum=" + sInNum + "(내부 클래스의 정적 변수 사용)");
		}
	}
}



public class InnerTest {

	public static void main(String[] args) {
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		//외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성 가능.
		System.out.println("외부클래스 이용하여 내부 클래스 기능 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}

}
