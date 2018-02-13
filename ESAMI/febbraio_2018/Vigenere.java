import java.util.Scanner;

public class Vigenere {

		public static void main(String[] args) {
			
			if (args.length == 0) {
				System.out.println("Chiave non fornita");
				return;
			}
			
			String verme = args[0].toUpperCase();
			Scanner in = new Scanner(System.in);
			int n = verme.length();
			int counter = 0;
			char cRot;
			
			while (in.hasNextLine()) {
				String line = in.nextLine().toUpperCase();
				for (int i = 0; i < line.length();i++) {
					if (counter == n) {
						counter =0;
					}
					if (Character.isLetter(line.charAt(i))) {
						// cRot deve valere: valore di linea.charAt(i) + valore di verme.charAt(i)
						// ma essere nel range 65-90
						// divido entrambi i valori per %65
						//divido il risultato per %26
						// aggiungo 65
						cRot = (char) ((line.charAt(i)%65+verme.charAt(counter)%65)%26+65);
						counter++;
					} else {
						cRot = line.charAt(i);
					}
					System.out.print(Character.toString((char) cRot));
				}
				System.out.println("");
				
				
			
			}
			
		}
	
}
