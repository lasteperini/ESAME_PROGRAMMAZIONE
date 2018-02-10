import java.util.Scanner;
import java.util.Arrays;


public class OccorrenzeTelefono {

	public static void main(String[] args) {
	
		String testo = args[0];
		int[] occ = occorrenze(testo.toCharArray());
		for (int i=0;i < 10;i++) {
			System.out.println(i+":"+occ[i]);
		}
		
	}
	
	private static int[] occorrenze(char[] charSequence) {
		int[] newCharArray = new int[10];
		int n;
		for (int i=0;i < 10;i++)
			newCharArray[i]=0;
		for (int i=0;i <charSequence.length;i++) {
			if (Character.isDigit(charSequence[i])) {
				n =  Character.getNumericValue(charSequence[i]);
				newCharArray[n]++;
			}
		}
		return newCharArray;
	}

}
