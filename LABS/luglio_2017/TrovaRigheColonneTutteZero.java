import java.io.File;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class TrovaRigheColonneTutteZero {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> righe = new ArrayList<Integer>();
		ArrayList<Integer> colonneZero = new ArrayList<Integer>();
		ArrayList<Integer> colonneUno = new ArrayList<Integer>();
	
		File file = new File(args[0]);
		int counter = 1;
		int lunghezza =0;
		
		try{
			Scanner in = new Scanner(file);
					
			while (in.hasNextLine()) {
				String riga = in.nextLine();
				lunghezza = riga.length();
				if (riga.indexOf("1") < 0 && riga.indexOf("0") > 0) 
					righe.add(counter);
				for (int i = 0; i < riga.length(); i++) {
					if (riga.charAt(i) == '1' ) {
						colonneUno.add(i);
					}
					
				}
					
				counter++;
				
			}
			
			Collections.sort(righe);
			
			System.out.println("righe tutte zero");
			for (Integer elem: righe)
				System.out.println(elem);
				
			System.out.println("colonne tutte zero");
			for (int i =0; i< lunghezza;i++) 
				if (!colonneUno.contains(i)) 
					System.out.println(i+1);
					
			
		
		} catch (	FileNotFoundException e) {
			System.out.println("file non esistente");
		}
			
			
			
		
		
	}
}
