import java.util.Scanner;

public class InvertiParole {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il testo");
		
		String testo = in.nextLine();
		
		StringBuilder bf = new StringBuilder(testo);
		
		
		System.out.println(bf.reverse());
					
		
	
	}
	
}
