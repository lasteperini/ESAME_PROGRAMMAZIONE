import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaMonete {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quante monete vuoi?");
		
		try {
			int valore = in.nextInt();
		
		
			if (valore < 1 || valore > 99) {
				System.out.println("Inserisci un numero tra 1 e 99");
				return;
			}
			
			int result = valore/50;
			System.out.println("50_cent = "+ result);
			valore = valore-50*result;
			result = valore/20;
			System.out.println("20_cent = "+ result);
			valore = valore-20*result;
			result = valore/10;
			System.out.println("10_cent = "+ result);
			valore = valore-10*result;	
			result = valore/5;
			System.out.println("5_cent = "+ result);
			valore = valore-5*result;	
			result = valore;
			System.out.println("1_cent = "+ result);
			
		} catch (InputMismatchException e) {
			System.out.println("Inserisci un numero tra 1 e 99");
			return;
		}
		
	}
	
}
