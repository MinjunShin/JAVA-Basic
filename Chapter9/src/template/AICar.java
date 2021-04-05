package template;

public class AICar extends Car {
	
	@Override
	
	public void drive() {
		System.out.println("자율 주행한다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춘다.");
		
	}

	@Override
	public void wiper() {
		System.out.println("자동으로 와이퍼가 동작한다.");
		
	}
	
}
