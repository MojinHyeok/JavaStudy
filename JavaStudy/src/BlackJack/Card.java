package BlackJack;

public class Card {

	//무늬
	private String pattern;
	
	//끝 수 (A,2~10,j,k,Q)를 의미
	private String denomination;

	public Card (String pattern, String denomination) {
		this.pattern = pattern;
		this.denomination = denomination;
	}
	
	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	@Override
	public String toString() {
		return "Card [pattern=" + pattern + ", denomination=" + denomination + "]";
	}
	
}
