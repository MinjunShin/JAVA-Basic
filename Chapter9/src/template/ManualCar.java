package template;

public class ManualCar extends Car {
	
	@Override
	
	public void drive() {
		System.out.println("���� �����Ѵ�.");
	}

	@Override
	public void stop() {
		System.out.println("�������� �����.");
		
	}
	
	@Override
	public void wiper() {
		System.out.println("�������� �����۰� �����Ѵ�.");
		
	}

}
