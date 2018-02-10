import java.util.Scanner;

public class EstraiMonomi {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il polinomio");
		
		String polinomio = in.nextLine();
		
		String[] monomi = polinomio.split("[ +]+");
		
		for (String m: monomi) {
			System.out.print(m);
			int max = 1;
			for (int i = 0;i<m.length();i++) {
				if (m.charAt(i) == '^') {
					int j = 1;
					String exp = "";
					while (j<m.length()-i && Character.isDigit(m.charAt(i+j))) {
						exp = exp+Character.toString(m.charAt(i+j));
						j++;
					}
					int numExp = Integer.valueOf(exp);
					if (numExp > max) {
						max =  numExp;
					}
				}
			}
			System.out.println("\t-----\tesponente massimo:"+max);
					
		}
	
	}
	
}
