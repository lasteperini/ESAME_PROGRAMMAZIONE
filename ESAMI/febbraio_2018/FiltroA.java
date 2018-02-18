import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FiltroA {

	public static void main(String[] args) throws FileNotFoundException {
	
		String filename = args[0];
		File file = new File(filename);
		Scanner in = new Scanner(file);
		StringBuilder sb = new StringBuilder();
		int numPari = 0;
		int numTotale = 0;
		double quot = 1.0;
		int counterRighe = 0;
		
		while (in.hasNextLine()) {
			String riga = in.nextLine();
			String[] parola = riga.split("[\t ]");
			
			int numPariPrec = numPari;
			
			numPari = 0;
			numTotale = 0;
			
			for (int i= 0;i< parola.length;i++) {
				if (!parola[i].equals("")) {
					if (parola[i].length()%2 ==0) {
						numPari++;			
					}
					numTotale++;
				}
			}
			
			if (numTotale !=0) {
				quot = (double) numPari / (double) numTotale;
			} 
			
			
			System.out.println("Riga: "+riga);
			System.out.println("Pari: "+numPari);
			if (numTotale !=0) {
				System.out.println("Rapporto: "+quot);
			} else {
				System.out.println("Rapporto: NaN");
			}
			
			if (counterRighe > 0) {
				if (numPari > numPariPrec) {
					sb.append("/");
				}
				if (numPari == numPariPrec) {
					sb.append("-");
				}
				if (numPari < numPariPrec) {
					sb.append("\\");
				}
			}
			counterRighe++;
			
			
		
		}
		
		System.out.println(sb);
		
	
	}


}
