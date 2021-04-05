package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ��� �Ҵ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ����.");
	}
	
	final public void run() { // ���a�� �޼���
		startCar();
		drive();
		stop();
		turnOff();
		wiper();
	}
}
