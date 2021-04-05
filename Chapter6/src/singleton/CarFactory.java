package singleton;

public class CarFactory {
	private static CarFactory factory = new CarFactory();
	
	private CarFactory() {
		
	}
	
	public Car createCar() {		
		Car car = new Car();
		return car;
	}
		

	public static CarFactory getFactory() {
		if(factory == null) {
			factory = new CarFactory();
		}		
		return factory;
	}		
	
}

