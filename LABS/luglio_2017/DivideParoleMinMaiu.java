import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DivideParoleMinMaiu {
	
	public static void main(String[] args) {
		
		ArrayList<String> maiu = new ArrayList<String>();
		ArrayList<String> minu = new ArrayList<String>();
		
	
		File file = new File(args[0]);
		
		try{
			Scanner in = new Scanner(file);
			
			while (in.hasNext()) {
				String parola = in.next();
				boolean soloTesto = true;
				for (int i = 0; i < parola.length(); i++) 
					if (!Character.isLetter(parola.charAt(i))) {
						soloTesto= false;
						break;
					}
				
				if (!soloTesto) 
					continue;
						
				if (Character.isLowerCase(parola.charAt(0))) {
					minu.add(parola);
				} else {
					maiu.add(parola);
				}
			}
			
			System.out.println("iniziano con minuscole:");
			for (String elem: minu)
				System.out.println(elem);
			
			System.out.println("iniziano con maiuscole:");
			for (String elem: maiu)
				System.out.println(elem);
			
			
		
		} catch (	FileNotFoundException e) {
			System.out.println("file non esistente");
		}
	}
	
}
