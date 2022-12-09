package CardGame;

abstract class Card implements CardInfo {
	String[] cardText ;
	String cardName;
	int cost;
	int attack;
	int heart;
	
	
	public void attack(Card counterCard) {//공격시 내체력과 상대체력 모두 감소함
		counterCard.heart = counterCard.heart - this.attack;
		this.heart = this.heart - counterCard.attack;
		re();
	}
	
	void destroy(String[] cardText) {
		if(heart <=0) {
			cardText[0] = "              ";
			cardText[1] = "              ";
			cardText[2] = "              ";
			cardText[3] = "              ";
			cardText[4] = "              ";
		}
	};
	
	public String[] makeCard() {
		String[] card = new String[5];
		card[0] = "[      cost:"+cost+"]";
		card[1] = "["+cardName+"]";
		card[2] = "[            ]";
		card[3] = "[            ]";
		card[4] = "[ATK:"+this.attack+" | "+"HP:"+this.heart+"]";
		return card;
	}
	
	public void playerAttack(Player player) {
		player.damagedHp(this.attack);
	}
	
	void re(){
		cardText = makeCard();
	};
	abstract void effect(GameSource gs);
}
