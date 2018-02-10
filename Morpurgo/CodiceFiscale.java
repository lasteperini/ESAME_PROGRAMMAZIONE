import java.util.Scanner;


public class CodiceFiscale{

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nNome:");
		String nome = in.nextLine();
		System.out.println("Cognome:");
		String cognome = in.nextLine();
				
		String cf = calcolaCF(cognome)+calcolaCF(nome);
		
		System.out.println(cf);
	
	}
	
	private static String calcolaCF(String testo) {	
		String out = "";
		int n = 0;
		for (int i=0;i<testo.length();i++) {
			if (n < 3) {
				char c = Character.toUpperCase(testo.charAt(i));
				if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U' ) {
					out = out+c;
					n++;
				}
			}
		}
		return out;
			
	}

}
