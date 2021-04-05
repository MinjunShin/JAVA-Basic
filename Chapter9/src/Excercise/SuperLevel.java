package Excercise;

public class SuperLevel extends PlayerLevel{

	@Override
	
	public void run() {
		System.out.println("매우 빠르게 달린다.");
	}
	
	@Override
	public void jump() {
		System.out.println("점프할 수 있다.");
	}
	
	@Override
	public void turn() {
		System.out.println("턴 할 수 있다.");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("===고급자 레벨입니다.===");
	}
	
}
