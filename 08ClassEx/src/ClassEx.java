/**
 * https://www.tutorialspoint.com/java/java_object_classes.htm
 * @author mhcrnl
 *
 */
import java.io.*;

class Caine{
	//variabile de instanta
	int varsta;
	String respira;
	String nume;
	// constructor fara parametrii
	public Caine(){
		
	}
	// constructor cu un parametru
	public Caine(String nume){
		this.nume = nume;
		System.out.println("Numele catelului: "+ nume);
	}
	// metoda
	void latra(){
		System.out.println("Acest caine este mut.");
	}
	// metoda
	void seHraneste(){
		
	}
	// metoda
	void doarme(){
		
	}
	public void setVarsta(int ani){
		varsta=ani;
	}
	public int getVarsta(){
		System.out.println("Catelul are varsta: "+ varsta);
		return varsta;
	}
}


public class ClassEx {
	
	public void variabilaLocala(){
		int vLocala =0;
		vLocala = vLocala+6;
		System.out.println("Variabila Locala este: "+ vLocala);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crearea unui obiect
		Caine cutu = new Caine("Azor");
		// accesarea unei metode din clasa Caine
		cutu.latra();
		// setarea  cu o metoda a varstei catelului
		cutu.setVarsta(5);
		cutu.getVarsta();
		// obtinerea varstei cu variabila int varsta din clasa
		System.out.println("Varsta catelui din variabila de instanta: "+cutu.varsta);
		
		Angajat primulAng = new Angajat("Vasile");
		Angajat angDoi = new Angajat("Mihai Cornel");
		
		primulAng.setVarsta(40);
		primulAng.setSalariu(1578.90);
		primulAng.afisareAngajat();
		
		angDoi.setVarsta(43);
		angDoi.setSalariu(1234.5678);
		angDoi.afisareAngajat();
		
		ClassEx exVar = new ClassEx();
		exVar.variabilaLocala();
	}

}
