import java.util.Scanner;

public class ConvertiInBinario {
	
	public static void main(String[] args) {
		System.out.println("Scrivi un numero binario di 4 cifre:");
		
		Scanner in = new Scanner(System.in);
		
		int binario = in.nextInt();
		
		int migliaia = binario/1000;
		int centinaia = (binario%1000)/100;
		int decine = ((binario%1000)%100)/10;
		int unita = ((binario%1000)%100)%10;
		
		int decimale = 8*migliaia+4*centinaia+2*decine+unita;
		
		System.out.println(binario+" in base 2 = "+ decimale+" in base 10");
		
	}
}
