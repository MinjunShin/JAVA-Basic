package generics;

public class Powder extends Material{
	public void doPrinting() {
		System.out.println("Poweder 재료로 출력한다.");
	}
	
	@Override
	
	public String toString() {
		return "재료는 Powder이다.";
	}

}
