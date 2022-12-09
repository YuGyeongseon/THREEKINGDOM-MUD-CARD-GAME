package CardGame;

class Player {
	int playerHeart = 30;
	
	public void damagedHp(int damage) {
		playerHeart = playerHeart - damage;
	}
}
