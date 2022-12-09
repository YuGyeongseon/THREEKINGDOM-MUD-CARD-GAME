package CardGame;

import java.util.Scanner;

public class Game {
	int turn = 1;
	int cost = 0;
	int deckNum = 5;
	int behavior = 0;
	void printBattleScreen(GameSource gs,Game g,Player p1, Player p2) {
		if(behavior > 0) {
			
		} else if(turn <=10) {
			cost = turn;
		} else {
			cost =10;
		}
		gs.printPlayer1(g,p1);
		System.out.println();
		gs.printPlayer1Card();
		System.out.println();
		gs.printPlayer2Card();
		System.out.println();
		gs.printPlayer2(g,p2);
	}
	void draw(Card[] handCard, Card[] deck,Game g) {
		if(g.behavior == 0) {
			if(turn ==1) {
				for(int i=0; i<handCard.length; i++) {
					handCard[i] = deck[i];
				} 
			} else if(deckNum > deck.length){
				System.out.println("카드가 없습니다.");
			}	else {
		
				for(int i =0; i<handCard.length; i++) {
					if(handCard[i] instanceof DefaultCard) {//DefaultCard
						handCard[i] = deck[deckNum];
						deckNum++;
						break;
					}
				}
			}
		}
	}
	void printOption(Card[] handCard) {
		System.out.println("     HAND1            HAND2            HAND3            HAND4            HAND5");
		for(int i=0; i<handCard.length; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(handCard[j].cardText[i]+"   ");
			}
			System.out.println();
		}
	}
	void putCard(int handCardNum,int location, Card[] handCard, GameSource gs,Game g) {
		if(handCard[handCardNum].cost <= cost) {
			g.cost = g.cost - handCard[handCardNum].cost;
			gs.summonPlayer2Card(location,handCard[handCardNum]);
			gs.player2Card[location-1].effect(gs);
			handCard[handCardNum] = new DefaultCard();
			handCard[handCardNum].destroy(handCard[handCardNum].cardText);
		}
	}
	static void setGame() {
		Card[] player1HandCard = new Card[5];
		Card[] player2HandCard = new Card[5];
		GameSource gs = new GameSource();
		Game g = new Game();
		Scanner sc =new Scanner(System.in);
		
		Card[] player1Deck = Deck.makeDeck(gs);
		Card[] player2Deck = Deck.makeDeck(gs);
		
		Deck.shuffle(player1Deck);
		Deck.shuffle(player2Deck);
		gs.resetPlayersCard();
		Player player1 = new Player();
		Player player2 = new Player();
		
		int select = 0;
		 do {
				g.draw(player1HandCard,player1Deck,g);
				g.draw(player2HandCard,player2Deck,g);
				if(g.turn == 1) {
					gs.player1Card[0] = player1HandCard[0];
				}
				g.printBattleScreen(gs,g,player1,player2);
				g.printOption(player2HandCard);
				try {
					System.out.println("1.턴종료 2.공격 3.장수 출전");
					select = sc.nextInt();
					if(select == 1) {
						g.turn++;
						g.behavior = 0;
					} else if( select == 2) {
						g.behavior++;
						System.out.println("아군 장수가 있는 필드를 선택하세요.");
						int selectCard = sc.nextInt();
						if(gs.player2Card[selectCard-1] instanceof DefaultCard) {
							System.out.println("선택하신 필드에 아군장수가 없습니다.");
							System.out.println("계속하려면 아무것이나 입력해주세요.");
							sc.next();
							continue;
						}
						System.out.println("적장수를 선택하세요. 직접 공격은 0을 입력해주세요.");
						int selectCounterCard = sc.nextInt();
						if(selectCounterCard ==0) {
							gs.player2Card[selectCard-1].playerAttack(player1);
							continue;
						}
						gs.player2Card[selectCard-1].attack(gs.player1Card[selectCounterCard-1]);
					} else if (select ==3) {
						g.behavior++;
						System.out.println("소환할 카드를 선택하세요.");
						int selectCard = sc.nextInt();
						if(player2HandCard[selectCard-1].cost > g.cost) {
							System.out.println("cost가 부족합니다.");
							System.out.println("계속하려면 아무것이나 입력해주세요.");
							sc.next();
							continue;
						}
						System.out.println("소환할 장소를 선택하세요.");
						int selectField = sc.nextInt();
						g.putCard(selectCard-1,selectField,player2HandCard,gs,g);
					} else if(select !=1&&select!=2&&select!=3) {
						System.out.println("입력이 잘못됬습니다.");
						
					}
				} catch(Exception e) {
					sc.next();
					System.out.println("입력이 잘못됬습니다.");
				}
			 } while(player1.playerHeart>0&&player2.playerHeart>0);
	}
}
