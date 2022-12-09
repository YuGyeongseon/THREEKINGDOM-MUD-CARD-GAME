package CardGame;

public class Deck {
	
	
	public static Card[] makeDeck(GameSource gs) {
		Card[] deck = new Card[30];
		deck[0] = new ZhugeLiang();
		deck[1] = new LiuBei();
		deck[2] = new GuanYu();
		deck[3] = new ZhangFei();
		deck[4] = new ZhaoYun();
		deck[5] = new ZhangLiao();
		deck[6] = new LuBu();
		deck[7] = new CaoCao();
		deck[8] = new XiahouDun();
		deck[9] = new XiahouYuan();
		deck[10] = new HuangZhong();
		deck[11] = new ZhouYu();
		deck[12] = new SunJian();
		deck[13] = new SunCe();
		deck[14] = new SunQuan();
		deck[15] = new DongZhuo();
		deck[16] = new PangTong();
		deck[17] = new SimaYi();
		deck[18] = new HuangGai();
		deck[19] = new LiuBiao();
		deck[20] = new TaishiCi();
		deck[21] = new WeiYan();
		deck[22] = new LuMeng();
		deck[23] = new GuoJia();
		deck[24] = new YuanShao();
		deck[25] = new WenChou();
		deck[26] = new YanLiang();
		deck[27] = new ZhangHe();
		deck[28] = new GaoShun();
		deck[29] = new JiLing();
		return deck;
	}
	public static void shuffle(Card[] deck) {
		for(int i=0; i<deck.length; i++) {
			Card tmp ;
			int j = (int)(Math.random()*(deck.length));
			tmp = deck[i];
			deck[i] = deck[j];
			deck[j] = tmp;
		}
	};
}
