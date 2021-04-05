package template;

public class ManualCar extends Car {
	
	@Override
	
	public void drive() {
		System.out.println("수동 주행한다.");
	}

	@Override
	public void stop() {
		System.out.println("수동으로 멈춘다.");
		
	}
	
	@Override
	public void wiper() {
		System.out.println("수동으로 와이퍼가 동작한다.");
		
	}

}
