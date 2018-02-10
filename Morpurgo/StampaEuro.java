import java.util.Scanner;


public class StampaEuro{

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nEuro:");
		double e = in.nextDouble();
		System.out.println("Cent:");
		double c = in.nextDouble();
		
		int euro = euro(e);
		int cent = cent(c);
		
		String s = stampaEuro(euro,cent);
		
		System.out.println(s);
	
	}
	
	private static int euro(double e) {	
		return (int) e;	
	}

	private static int cent(double c) {	
		return (int) c;	
	}

	private static String stampaEuro(int e, int c) {	
		return "Eu "+e+"."+c;	
	}
}
