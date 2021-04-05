package generics;

public class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		// T자료형 변수 material을 반환하는 제네릭 메서드
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void Printing() {
		material.doPrinting();
	}

}
