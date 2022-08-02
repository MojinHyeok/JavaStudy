package BlackJack;

import java.util.Scanner;

public class Game {
	
	public void play(){
        System.out.println("========= Blackjack =========");
        Scanner sc = new Scanner(System.in);
        		
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();
        
        this.playPhase(sc,cardDeck, gamer);
    }

	private void playPhase(Scanner sc, CardDeck cardDeck, Gamer gamer) {
		String gameInput;
		while(true) {
			System.out.println("카드를 뽑겠습니까? 종료를 원하신다면 0을 입력해주세요");
			gameInput = sc.nextLine();
			
			if("0".equals(gameInput)) {
				
				break;
			}
			Card card = cardDeck.draw();
			gamer.receiveCard(card);
			
		}
		
	}
}
