package gameLevel;

public class Player {
	
	private PlayerLevel level; //Player�� ������ level���� ����
	

	public Player() { // ó�� ���� �� Beginner�� �����ϸ� ���
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
