import java.util.Scanner;

public class Parcheggio {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String primoInput = in.nextLine();
		String[] parcheggi = primoInput.split(" ");
		
		String secondoInput = in.nextLine();
		String[] auto = secondoInput.split(" ");
		
		boolean[] output = trovaPosto(parcheggi, auto);
		
		for (int i = 0; i < output.length ; ++i)
				if (!output[i]) {
					System.out.printf("%s ", parcheggi[i]);
				}
			System.out.printf("\n");
		
	}
	
	private static boolean[] trovaPosto(String[] parcheggi, String[] auto) {
		
		boolean[] trovato = new boolean[parcheggi.length];
		for (int numeroAuto = 0; numeroAuto < auto.length; numeroAuto++) {
			for (int i =0 ; i < parcheggi.length;i++) {
				if (parcheggi[i].equals(auto[numeroAuto]) && !trovato[i]) {
					trovato[i] = true;
					break;
				} 				
			}
		}
		
		return 	trovato;
			
	}


}
