package TDD.StringCalculator;

public class Positive {
	private int number;
	
	//숫자 변환과 인트 검사하는부분을 두개로 나눔.
	public Positive(String value) {
		this(Integer.parseInt(value));
	}
	
	public Positive (int number) {
		if(number < 0 ) { 
			throw new RuntimeException();
		}
		this.number = number;
	}
	
	public Positive add(Positive other) {
		return new Positive(this.number + other.number);
	}
	
	public int getNumber() {
		return number;
	}

}
