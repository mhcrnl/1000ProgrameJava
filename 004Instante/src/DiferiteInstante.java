
class Exemplu{
	int x;
	//constructor implicit
	Exemplu(){
		System.out.println("constructor implicit");
	}
	//constructor explicit
	Exemplu(int x){
		this.x = x;
	}
	//instanta explicita la momentul initializarii clasei
	static Exemplu primulX = new Exemplu(1);
	//metoda de actualizare a campului x pentru obiectul curent
	public void setX(int x){
		this.x = x;
	}
	//metoda necesara pentru afisqarea explicita a unei instante din clasa Exemplu
	public String toString(){
		return "x="+x;
	}
}// sfarsitul definitiei clasei Exemplu

public class DiferiteInstante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("primulX: "+Exemplu.primulX);
		//apelul constructorului implicit
		Exemplu obiectDoi = null;
		// crearea implicita folosind newInstance()
		try{
			obiectDoi = (Exemplu)Class.forName("Exemplu").newInstance();
		} catch (Exception e) {
			System.out.println(e);
			
		}
		System.out.println("obiectDoi: "+obiectDoi);
		obiectDoi.setX(2);
		System.out.println("obiectDoi "+ obiectDoi);
		// crearea unui obiect folosind operatrul new
		Exemplu obiectTrei = new Exemplu(3);
		System.out.println("obiectTrei: " + obiectTrei);
	}

}// sfarsitul clasei DiferiteInstante
