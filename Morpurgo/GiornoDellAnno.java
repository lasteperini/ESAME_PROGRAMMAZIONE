import java.util.Scanner;
import java.util.InputMismatchException;

public class GiornoDellAnno {
	
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Inserisci il mese:");
	
	int mese, giorno;
	
	try {
		mese = in.nextInt();
	} catch ( InputMismatchException e) {
		
		System.out.println("Formato del dato non corretto!!!!");
		return;
	}
	
	if (mese <1 || mese > 12) {
		System.out.println("Formato del dato non corretto!!!!");
		return;
	}
		

	System.out.println("Inserisci il giorno:");
		
	try {
		giorno = in.nextInt();
	} catch ( InputMismatchException e) {
		
		System.out.println("Formato del dato non corretto!!!!");
		return;
	}
	
	if (giorno <1 || giorno > 31) {
		System.out.println("Formato del dato non corretto!!!!");
		return;
	}
	
	int somma = giorno;
	
	int i = 1 ;
	
	while (i <mese) {
	
		switch (i) {
			case 1: somma += 31;
			break;
			case 2: somma += 31;
			break;
			case 3: somma += 28;
			break;
			case 4: somma += 31;
			break;
			case 5: somma += 30;
			break;
			case 6: somma += 31;
			break;
			case 7: somma += 30;
			break;
			case 8: somma += 31;
			break;
			case 9: somma += 31;
			break;
			case 10: somma += 30;
			break;
			case 11: somma += 31;
			break;
			case 12: somma += 30;
			break;
		}
		i++;
	}
	
	System.out.println("Sono trascorsi "+somma+" giorni dall'inizio dell'anno");
	
	}
}
