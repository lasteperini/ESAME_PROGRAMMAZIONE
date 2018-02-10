import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FiltroA {

	public static void main(String[] args) throws FileNotFoundException {
	
		String filename = args[0];
		File file = new File(filename);
		Scanner in = new Scanner(file);
		int sommaPrecedente = 0;
		
		while (in.hasNext()) {
			
			String s = in.next();
		
			int sommaAttuale = FiltroA.somma(s);			
			int differenza = sommaAttuale - sommaPrecedente;
			sommaPrecedente = sommaAttuale;
			System.out.print(s+":"+differenza+",");
			System.out.println(FiltroA.controlla(s));
		}
	
	
	}
	
	public static int somma (String s) {
		int totale = 0;
		for (int i =0;i<s.length(); i++) {
			totale += s.charAt(i);
		}
		return totale;
	}
	
	public static String controlla (String s) {
		boolean upper = true, lower = true, strano = false;
		for (int i =0;i<s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				if (Character.isLowerCase(c)) {
					upper = false;
				}
				if (Character.isUpperCase(c)) {
					lower = false;
				}				
			} else {
				upper = false;
				lower = false;
				if (c == '<' || c == '>' || c == '=' || c == '!') {
					strano = true;
				}
			}					
		}
		if (strano) 
			return "S";
		
		if (lower) 
			return "L";
		
		if (upper) 
			return "U";
		
		
		return "O";
		
	}
}
