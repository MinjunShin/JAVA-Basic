package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("½Ãµ¿À» ÄÒ´Ù.");
	}
	
	public void turnOff() {
		System.out.println("½Ãµ¿À» ²ö´Ù.");
	}
	
	final public void run() { // ÅÛÀa¸´ ¸Ş¼­µå
		startCar();
		drive();
		stop();
		turnOff();
		wiper();
	}
}
