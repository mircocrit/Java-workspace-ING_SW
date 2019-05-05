package Albergo.data;

public class Suite extends camera {
	private float prezzo_service;		//di default sono package
	private float conto_frigobar;
	
	
	public Suite(int num, int letti, float prezzo, int piano,boolean balcone) {
		this.num=		num;
		this.letti=		letti;
		this.prezzo=	prezzo;
		this.piano=		piano;
		this.balcone=	balcone;
	}
	
	@Override
	public float getPrezzo() {
		return this.prezzo*prezzo_service+conto_frigobar;
	}
	
}
