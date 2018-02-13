import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DivideParoleMinMaiu {
	
	public static void main(String[] args) {
	
		File file = new File(args[0]);
		ArrayList<String> minuscole = new ArrayList<String>(), maiuscole= new ArrayList<String>();
		boolean skip;
		
		try {
			Scanner in = new Scanner(file);
			
			while (in.hasNextLine()) {
				String linea = in.nextLine();
				String[] paroleLinea = linea.split(" ");
				for (String elem : paroleLinea) {
					//controllo che contenga solo lettere
					skip = false;
					for (int i = 0; i < elem.length(); i++) {
						char c = elem.charAt(i);
						
						if (!Character.isLetter(c)) {
							skip = true;
							break;
						}
					}
					if (!skip) {
						if (elem.length() != 0) {
							char init = elem.charAt(0);
							if (Character.isUpperCase(init)) 
								maiuscole.add(elem);
							if (Character.isLowerCase(init)) 
								minuscole.add(elem);
						}
					}
				}
				
			}
			
			System.out.println("iniziano con minuscole:");
			for (String elem : minuscole) 
				System.out.println(elem);
			
			System.out.println("iniziano con maiuscole:");
			for (String elem : maiuscole) 
				System.out.println(elem);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("file non esistente");
		}
	
	}
	
}
