import java.util.Scanner;


public class AlfabetoFarfallino {

	public static void main(String[] args) {
	
		for (int i=0;i<args.length;i++) {
			System.out.print(farfallizza(args[i])+" ");
		}
		
		System.out.print("\n");
	}
	
	private static String farfallizza(String testo) {	
		String out = "";
		for (int i=0;i<testo.length();i++) {
			 char c = Character.toUpperCase(testo.charAt(i));
			 if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
				 out = out+testo.charAt(i)+"f"+testo.charAt(i);
			 } else {
				 out = out+testo.charAt(i);
			 }
			
		}
		return out;
			
	}

}
