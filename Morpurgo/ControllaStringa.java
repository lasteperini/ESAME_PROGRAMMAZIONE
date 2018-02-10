import java.util.Scanner;

public class ControllaStringa {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Fornisci la stringa");
		
		String s = in.nextLine();
		
		System.out.println("La stringa e' lunga: " + s.length() + " caratteri");
		
		System.out.println("I primi 2 caratteri sono: " + s.charAt(0) + " e " + s.charAt(1));
		
		System.out.println("La prima 'a' si trova in posizione: "+ s.indexOf("a"));
		
		System.out.println("Prego fornire una stringa");
		
		String madre = in.nextLine();
		
		System.out.println("Prego fornire una sottostringa");
		
		String figlia = in.nextLine();
		
		int inizio = madre.indexOf(figlia);
		
		inizio = inizio-1;
		
		if (inizio > -1) 
			System.out.println("La sottostringa inizia al carattere " + inizio);
		else 
			System.out.println("Sottostringa non trovata");
			
		System.out.println("Fornisci un'altra stringa");
		
		String parola = in.next();
		
		System.out.println("La prima parola e' "+ parola);
			
	}
	
}
