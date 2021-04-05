package object;

class point {
	int x;
	int y;
	

	point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + "," + "y" + y;
	}
}

class Circle implements Cloneable{
	point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.radius = radius;
		point = new point(x, y);
	}
	
	public String toString() {
		return "원점은" + point + "반지름은" + radius;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		// clone()메서드 사용 시 발생할 수 있는 오류를 예외처리
	}
}


public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10,20,30);
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		
	}

}
