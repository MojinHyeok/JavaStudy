package TDD.BowlingGame;

public class Game {

	private int score = 0;

	public void roll(int pins) {
		this.score  += pins;
	}

	public int getScore() {
		// TODO Auto-generated method stub
		return this.score;
	}

}
