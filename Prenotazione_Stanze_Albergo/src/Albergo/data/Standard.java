package Albergo.data;

import Albergo.data.management.Bookable;

public class Standard extends camera implements Bookable {	//sol standard posssono far modifiche


	public Standard(int num, int letti, float prezzo, int piano,boolean balcone) {
		this.num=		num;
		this.letti=		letti;
		this.prezzo=	prezzo;
		this.piano=		piano;
		this.balcone=	balcone;
	}
	
	/**
	 * 
	 * questo metodo applica una orommozione speciale in base al periodo 
	 * @param percentage
	 * @return Ritorna vero se ha avuto successso .... ad esempio
	 */
	public void applyPromotion(float percentage) {
		this.prezzo*= percentage;
	}


	@Override
	public void prenota() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void cambia_prenotazione() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void cancella_prenotazione() {
		// TODO Auto-generated method stub
		
	}
	

	
}
