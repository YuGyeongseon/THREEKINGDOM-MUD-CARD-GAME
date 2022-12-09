package CardGame;

class Druid extends Card {
	Druid() {
		this.cardName = "    Druid   ";
		this.cost = 5;
		this.attack = 5;
		this.heart = 6;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
	
}

class DefaultCard extends Card {
	DefaultCard() {
		this.cardName = "          ";
		this.cost = 0;
		this.attack = 0;
		this.heart = 0;
		cardText = makeCard();
		destroy(cardText);
		
	}
	void effect(GameSource gs) {
		
	}
}

class ZhugeLiang extends Card {
	ZhugeLiang(){
		this.cardName = "Zhuge  Liang";
		this.cost = 6;
		this.attack = 2;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	
	void effect(GameSource gs) {
		for(int i=0; i<gs.player2Card.length;i++) {
			if(gs.player2Card[i] instanceof ZhugeLiang) {
				
			} else if(!(gs.player2Card[i] instanceof DefaultCard)) {
					gs.player2Card[i].attack = 9;
					gs.player2Card[i].heart = 9;
			}
		}
	}
	
}

class LiuBei extends Card {
	LiuBei() {
		this.cardName = "  Liu  Bei  ";
		this.cost = 4;
		this.attack = 4;
		this.heart = 4;
		cardText = makeCard();
		
		destroy(cardText);
	}
	void effect(GameSource gs) {
		for(int i=0; i<gs.player2Card.length; i++) {
			if(gs.player2Card[i] instanceof LiuBei) {
				if(i==0) {
					if(!(gs.player2Card[i+1] instanceof DefaultCard)) {
						gs.player2Card[i+1].attack = gs.player2Card[i+1].attack+2;
						gs.player2Card[i+1].heart = gs.player2Card[i+1].heart+2;
						if(gs.player2Card[i+1].heart>9) {
							gs.player2Card[i+1].heart=9;
						}
						if(gs.player2Card[i+1].attack>9) {
							gs.player2Card[i+1].attack=9;
						}
					}
				} else if( 4 >i&&i >=1) {
					if(!(gs.player2Card[i+1] instanceof DefaultCard)) {
						gs.player2Card[i+1].attack = gs.player2Card[i+1].attack+2;
						gs.player2Card[i+1].heart = gs.player2Card[i+1].heart+2;
					}
					if(!(gs.player2Card[i-1] instanceof DefaultCard)) {
						gs.player2Card[i-1].attack = gs.player2Card[i-1].attack+2;
						gs.player2Card[i-1].heart = gs.player2Card[i-1].heart+2;
					}
					if(gs.player2Card[i+1].heart>9) {
						gs.player2Card[i+1].heart=9;
					}
					if(gs.player2Card[i+1].attack>9) {
						gs.player2Card[i+1].attack=9;
					}
					if(gs.player2Card[i-1].heart>9) {
						gs.player2Card[i-1].heart=9;
					}
					if(gs.player2Card[i-1].attack>9) {
						gs.player2Card[i-1].attack=9;
					}
				} else {
					if(!(gs.player2Card[i-1] instanceof DefaultCard)) {
						gs.player2Card[i-1].attack = gs.player2Card[i-1].attack+2;
						gs.player2Card[i-1].heart = gs.player2Card[i-1].heart+2;
					}
					if(gs.player2Card[i-1].heart>9) {
						gs.player2Card[i-1].heart=9;
					}
					if(gs.player2Card[i-1].attack>9) {
						gs.player2Card[i-1].attack=9;
					}
				}
			}
		}
	}
}

class GuanYu extends Card {
	GuanYu() {
		this.cardName = "  Guan  Yu  ";
		this.cost = 9;
		this.attack = 9;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class ZhangFei extends Card {
	ZhangFei() {
		this.cardName = " Zhang  Fei ";
		this.cost = 5;
		this.attack = 9;
		this.heart = 3;
		cardText = makeCard();
		destroy(cardText);
		
	}
	void effect(GameSource gs) {
		
	}
}

class ZhaoYun extends Card {
	ZhaoYun() {
		this.cardName = "  Zhao Yun  ";
		this.cost = 2;
		this.attack = 3;
		this.heart = 4;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class ZhangLiao extends Card {
	ZhangLiao() {
		this.cardName = " Zhang Liao ";
		this.cost = 1;
		this.attack = 2;
		this.heart = 3;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class LuBu extends Card {
	LuBu() {
		this.cardName = "    Lu Bu   ";
		this.cost = 9;
		this.attack = 9;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class CaoCao extends Card {
	CaoCao() {
		this.cardName = "   Cao Cao  ";
		this.cost = 4;
		this.attack = 2;
		this.heart = 2;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		for(int i=0; i<gs.player2Card.length;i++) {
			if(gs.player2Card[i] instanceof DefaultCard) {
				gs.player2Card[i] = new XiahouDun();
				break;
			}
		}
		for(int i=0; i<gs.player2Card.length;i++) {
			if(gs.player2Card[i] instanceof DefaultCard) {
				gs.player2Card[i] = new XiahouYuan();
				break;
			}
		}
	}
}

class XiahouDun extends Card {
	XiahouDun() {
		this.cardName = " Xiahou Dun ";
		this.cost = 1;
		this.attack = 5;
		this.heart = 3;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class XiahouYuan extends Card {
	XiahouYuan() {
		this.cardName = " XiahouYuan ";
		this.cost = 5;
		this.attack = 9;
		this.heart = 3;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class HuangZhong extends Card {
	HuangZhong() {
		this.cardName = " HuangZhong ";
		this.cost = 3;
		this.attack = 4;
		this.heart = 3;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class ZhouYu extends Card {
	ZhouYu() {
		this.cardName = "   Zhou Yu  ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class SunJian extends Card {
	SunJian() {
		this.cardName = "  Sun Jian  ";
		this.cost = 1;
		this.attack = 3;
		this.heart = 3;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class SunCe extends Card {
	SunCe() {
		this.cardName = "   Sun Ce   ";
		this.cost = 2;
		this.attack = 4;
		this.heart = 4;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class SunQuan extends Card {
	SunQuan() {
		this.cardName = "  Sun Quan  ";
		this.cost = 3;
		this.attack = 7;
		this.heart = 8;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class DongZhuo extends Card {
	DongZhuo() {
		this.cardName = " Dong  Zhuo ";
		this.cost = 9;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class PangTong extends Card {
	PangTong() {
		this.cardName = " Pang  Tong ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class SimaYi extends Card {
	SimaYi() {
		this.cardName = "  Sima  Yi  ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class HuangGai extends Card {
	HuangGai() {
		this.cardName = " Huang  Gai ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class LiuBiao extends Card {
	LiuBiao() {
		this.cardName = "  Lia Biao  ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class TaishiCi extends Card {
	TaishiCi() {
		this.cardName = " Taishi  Ci ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class WeiYan extends Card {
	WeiYan() {
		this.cardName = "  Wei  Yan  ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class LuMeng extends Card {
	LuMeng() {
		this.cardName = "  Lu  Meng  ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class GuoJia extends Card {
	GuoJia() {
		this.cardName = "  Guo  Jia  ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class YuanShao extends Card {
	YuanShao() {
		this.cardName = " Yuan  Shao ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class WenChou extends Card {
	WenChou() {
		this.cardName = "  Wen Chou  ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	
	void effect(GameSource gs) {
		
	}
}

class YanLiang extends Card {
	YanLiang() {
		this.cardName = " Yan  Liang ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class ZhangHe extends Card {
	ZhangHe() {
		this.cardName = "  Zhang He  ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	
	void effect(GameSource gs) {
		
	}
}

class GaoShun extends Card {
	GaoShun() {
		this.cardName = "  Gao Shun  ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
}

class JiLing extends Card {
	JiLing() {
		this.cardName = "  Ji  Ling  ";
		this.cost = 1;
		this.attack = 1;
		this.heart = 9;
		cardText = makeCard();
		destroy(cardText);
	}
	void effect(GameSource gs) {
		
	}
