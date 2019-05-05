package Albergo.data;

public abstract class camera {	
	protected int num;
	protected int letti;			//protected: visibile alle figlie
	protected float prezzo;
	protected int piano;
	protected boolean balcone;
	

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	public int getLetti() {
		return letti;
	}
	public void setLetti(int letti) {
		this.letti = letti;
	}
	
	
	
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
	
	public int getPiano() {
		return piano;
	}
	public void setPiano(int piano) {
		this.piano = piano;
	}
	
	
	
	public boolean isBalcone() {
		return balcone;
	}
	public void setBalcone(boolean balcone) {
		this.balcone = balcone;
	}
	

}
