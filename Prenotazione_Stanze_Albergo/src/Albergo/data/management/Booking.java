package Albergo.data.management;

import Albergo.data.camera;

public class Booking {
	private camera camera;
	private int start_date;
	private int end_date;
	
	public Booking(camera camera,int start,int end) {
		this.camera=camera;
		this.start_date=start;
		this.end_date=end;
		
	}
		
	
	public float getTotalPrice(){
		int days= end_date - start_date;
		return camera.getPrezzo()*days;	//
	}
	
	//public void delete() {
		
	//}
	
	
}
