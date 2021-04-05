package template;

public class CarTest {
	public static void main(String[] args) {
		
		System.out.println("===AI Car===");
		Car mycar = new AICar();
		mycar.run();
		
		System.out.println("===Manual Car===");
		Car yourcar = new ManualCar();
		yourcar.run();
	}

}
