import java.util.Scanner;

public class LunghezzaParole {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int numeroParole = 0;
		int sommaCaratteri = 0;
		
		while (in.hasNext()) {
			String parola = in.next();
			if (parola.length()> max) {
				max = parola.length();
			}
			if (parola.length()< min) {
				min = parola.length();
			}
			sommaCaratteri += parola.length();
			numeroParole++;
			
		}
		
		int media = sommaCaratteri/numeroParole;
		
		System.out.println("max: "+ max);
		System.out.println("med: "+ media);
		System.out.println("min: "+ min);
		
			
		
	}
	
	
}
