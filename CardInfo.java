package CardGame;

public interface CardInfo {
	
	public abstract void attack(Card counterCard);
	
	public abstract void playerAttack(Player player);
	
	public abstract String[] makeCard();
	
}
