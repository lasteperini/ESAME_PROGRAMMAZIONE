import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


public class TrovaRigheColonneTutteZero {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayRighe = new ArrayList<Integer>(), arrayColonne = new ArrayList<Integer>();
		boolean init=false;
		int contaRighe = 0;
		String linea;
		
		File file = new File(args[0]);
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
		
				linea = scanner.nextLine();
				contaRighe++;
				if (linea.indexOf("1") == -1) 
					arrayRighe.add(contaRighe);
				
					
				//valuto che le colonne inizialmente siano tutte a true
				// se trovo un elemento 1 almeno una volta la metto a false
				
				//inizializzazione
				if (!init) {
					for (int i = 0; i < linea.length();i++) {
						arrayColonne.add(i+1);
					}
					init = true;
				}
				//valuto ogni riga, elemento per elemento
				for (int i = 0; i < linea.length();i++) {
					if (linea.charAt(i) != '0' && arrayColonne.contains(i+1)) {
							int index = arrayColonne.indexOf(i+1);
							arrayColonne.remove(index);
							
					}
				}
					
			}
				
			System.out.println("righe tutte zero:");
			for (int elem : arrayRighe) 
				System.out.println(elem);
			
			System.out.println("colonne tutte zero:");
			for (int elem : arrayColonne) 
				System.out.println(elem);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("file non esistente");
		}
	}
}
	
