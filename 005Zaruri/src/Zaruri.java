import java.util.Random;
import java.io.*;

public class Zaruri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] zar = new int[2];
		for(int k=0; k<10; k++){
			for(int i=0; i<2; i++){
				zar[i] = (int)(r.nextDouble()*6)+1;
			}
			System.out.println("\nZarurile sunt: "+ zar[0] +" "+zar[1]);
			if(zar[0] == zar[1]){
				System.out.println("Ati castigat! Zarurile sunt" + " egale!");
			} else {
				System.out.println("Ati pierdut! Zarurile nu sunt egale!");
			}
			// asteptarea tastei enter
			System.out.println("Apasati tasta ENTER pentru a continua...");
			try{
				// citim un caracter de la tastatura
				System.in.read();
				// eliminam celelalte caractere citite
				System.in.skip(System.in.available());
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("Aplicatia s-a terminat!");
	}

}// sfarsitul clasei zaruri

