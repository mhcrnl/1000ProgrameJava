import java.io.*;

public class Encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println(isr.getEncoding());
		
		int a = 1400000000, b = 1600000000;
		System.out.println(a+b);
		
		short u = (short) 32678;
		System.out.println("U= "+ u);
		
		double x=2, y=0;
		if(Double.isInfinite((x/y)))
			System.out.println("infinit");
		else
			System.out.println((x/y));
		
		double x1=0, y2=0;
		if(Double.isNaN(x1/y2))
			System.out.println("operatie care conduce la obtinera" +"unui nenumar.");
		//functia radical de ordin 2 este corecta - verificare
		float a1=0, b1=1, d=-5;
		double radical = Math.sqrt(d);
		if(!Double.isNaN(radical)){
			double radacina = (-b1 + radical)/(2.0f*a1);
			System.out.println(radacina);
			
		} else
			System.out.print("d este negativ sau este NaN.");
		//depasirea domeniului catre plus infinit
		double infinitMare = 1e308;
		System.out.println(infinitMare * 10);
	}

}
