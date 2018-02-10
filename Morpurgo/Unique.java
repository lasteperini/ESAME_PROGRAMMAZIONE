import java.util.Scanner;
import java.util.Arrays;


public class Unique {

	public static void main(String[] args) {
	
		String testo = args[0];
		System.out.println("RESULT: "+Arrays.toString(rimuoviDuplicati(testo.toCharArray())));
		//rimuoviDuplicati(testo.toCharArray());
		
	}
	
	private static char[] rimuoviDuplicati(char[] charSequence) {
		char[] newCharArray = new char[charSequence.length];
		int n=0;
		System.out.println(Arrays.toString(charSequence));
		for (int i = charSequence.length-1 ; i>=0;i--) {
			boolean found = false;
			System.out.println("i ==> "+i+" charSequence[i] ==> "+ charSequence[i]);
			for (int j=0;j< i;j++) {
				System.out.println("\t\tj ==> "+i+" charSequence[j] ==> "+ charSequence[j]);
				if (charSequence[i] == charSequence[j] ) {
					found = true;
				}					
			}
			if (!found) {
				newCharArray[i] = charSequence[i];
				
			}
		}
		
		return newCharArray;
	}

}
