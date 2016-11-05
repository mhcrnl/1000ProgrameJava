
public class Aplicatie {
	public static void main(String []args){
		if(args.length == 0)
			System.out.println("Aceasta aplicatie este independenta.");
	 else {
		System.out.println("Argumentele programului sunt: ");
		for(int i=0; i<args.length; i++)
			System.out.println(args[i]);
		}
	 }			
}

