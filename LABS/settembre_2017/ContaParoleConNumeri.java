import java.util.Scanner;

public class ContaParoleConNumeri {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numSoloLettere = 0;
		int numConCifre = 0;
		int totCifre = 0;

		while (in.hasNext()) {
			String s = in.next();

			boolean digit = false;
			for (int i =0 ; i < s.length();i++) {
			
				if (Character.isDigit(s.charAt(i))) {
					totCifre++;
					digit = true;
				}


			}
			if (digit) {
				numConCifre++;
			} else {
				numSoloLettere++;
			}

		}

		System.out.println("parole con cifre; "+numConCifre);
		System.out.println("parole senza cifre; "+numSoloLettere);
		System.out.println("numero totale di cifre; "+totCifre);



	
	}


}
