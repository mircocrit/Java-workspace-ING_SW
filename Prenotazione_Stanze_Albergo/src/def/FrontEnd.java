package def;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Albergo.data.camera;
import Albergo.data.Standard;

public class FrontEnd {

	public static void main(String[] args) throws IOException {
		InputStreamReader input= new  InputStreamReader(System.in);
		BufferedReader buff= new BufferedReader(input);
		
		System.out.println("Scrivi");
		String qualcosa = buff.readLine();
		
		System.out.println("Hai detto: "+ qualcosa);
		camera cam = new Standard(103,2,60.5f,1,false);		//principio di sosittuzione di liskov
			
		
		
	}

}
