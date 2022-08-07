package BlackJack;

import java.util.List;

public interface Player {

	//공통점을 묶어 Play라는 객체를 생성
	// 서로 다른 객체들의 차이점을 배제하고 공통점만을 취해 단순화 하는 것을 추상화라고함.
	
	void receiveCard(Card card);

    void showCards();

    List<Card> openCards();
    
    void turnOff();

    void turnOn();

    boolean isTurn();
    
    String getName();
    
    int getPointSum ();
}
