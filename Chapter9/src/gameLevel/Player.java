package gameLevel;

public class Player {
	
	private PlayerLevel level; //Player가 가지는 level변수 선언
	

	public Player() { // 처음 생성 시 Beginner로 시작하며 출력
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}


	public void upgrageLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}
	
	
}
