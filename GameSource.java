package CardGame;

public class GameSource {
	Card[] player1Card = new Card[5];
	Card[] player2Card = new Card[5];
	
	void resetPlayersCard() {
		for(int i=0;i<5;i++) {
			player1Card[i] = new DefaultCard();
			player2Card[i] = new DefaultCard();
			player1Card[i].destroy(player1Card[i].cardText);
			player2Card[i].destroy(player2Card[i].cardText);
		}
	}
	
	void printPlayer1Card() {
		for(int i=0; i<player1Card.length;i++) {
			player1Card[i].re();
			player1Card[i].destroy(player1Card[i].cardText);
			for(int j=0; j<5; j++) {
				System.out.print(player1Card[j].cardText[i]+"   ");
			}
			System.out.println();
		}
	}
	
	void printPlayer2Card() {
		for(int i=0; i<player2Card.length;i++) {
			player2Card[i].re();
			player2Card[i].destroy(player2Card[i].cardText);
			for(int j=0; j<5; j++) {
				System.out.print(player2Card[j].cardText[i]+"   ");
			}
			System.out.println();
		}
	}
	
	void summonPlayer1Card(int location, Card summonCard) {
		player1Card[location-1] = summonCard;
	}
	
	void summonPlayer2Card(int location, Card summonCard) {
		player2Card[location-1] = summonCard;
	}
	
	void printPlayer1(Game g,Player p) {
		System.out.println("--------------------------------------_______-------------------------------------");
		System.out.println("-------------------------------------[-------]------------------------------------");
		System.out.println("-----------------------------------[---/===\\---]----------------------------------");
		System.out.println("-----------------------------------[---|olo|---]----------------------------------");
		System.out.println("-----------------------------------[---\\<=>/---]--[HP:"+p.playerHeart+"]-------------------------");
		System.out.println("-----------------------------------[--player1--]----------------------------------");
		System.out.println("------------------------------------===========--------------------------turn:"+g.turn+"---");
	}
	
	void printPlayer2(Game g , Player p) {
		System.out.println("--------------------------------------_______----------------------------cost:"+g.cost+"---");
		System.out.println("-------------------------------------[-------]------------------------------------");
		System.out.println("-----------------------------------[---/===\\---]----------------------------------");
		System.out.println("-----------------------------------[---|olo|---]----------------------------------");
		System.out.println("-----------------------------------[---\\<=>/---]--[HP:"+p.playerHeart+"]-------------------------");
		System.out.println("-----------------------------------[--player2--]----------------------------------");
		System.out.println("------------------------------------===========-----------------------------------");
	}
}
