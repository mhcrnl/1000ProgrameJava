import java.io.*;

public class Angajat {
	// variabile de instanta
	String nume;
	int varsta;
	double salariu;
	//constructor
	public Angajat(String nume){
		this.nume = nume;
	}
	// metoda de obtinere a varstei angajatului
	public void setVarsta(int ani){
		varsta=ani;
	}
	public void setSalariu(double bani){
		salariu = bani;
	}
	//afisarea datelor angajatului
	public void afisareAngajat(){
		System.out.println("Nume: "+ nume);
		System.out.println("Varsta: "+ varsta);
		System.out.println("Salariu: "+ salariu);
	}
}
