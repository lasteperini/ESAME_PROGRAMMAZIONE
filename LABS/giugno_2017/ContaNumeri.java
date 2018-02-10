import java.util.Scanner;

public class ContaNumeri {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int interi = 0;
		int floating = 0;
		
		while (in.hasNext()) {
			String parola = in.next();
			String type = ContaNumeri.typeWord(parola);
			switch (type) {
				case "integer":interi++;
				break;
				case "floating":floating++;
			}
		}
		
		System.out.println("interi: "+interi);
		System.out.println("floating: "+floating);
		
		
	}
	
	private static String typeWord(String parola) {
		
		if (parola.indexOf(".") == -1) {
			try {
				Integer.parseInt(parola);
				return "integer";
			} catch (NumberFormatException e) {
				return "word";
			}
		} else {
			try {
				Double.parseDouble(parola);
				return "floating";
			} catch (NumberFormatException e) {
				return "word";
			}
		}	
		
	}
		
	
}
