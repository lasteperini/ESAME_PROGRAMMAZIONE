import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class OrdinaArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> elenco = new ArrayList<String>();
		
		elenco.add(args[0]);
		
				
		for (int i= 1; i< args.length;i++) {
			ArrayList<String> temp = new ArrayList<String>();
			boolean found = false;
			for (String elem: elenco) {
				if (args[i].compareTo(elem) < 0 && !found) {
					temp.add(args[i]);
					temp.add(elem);
					found = true;
				} else {
					temp.add(elem);
				}
			}
			if (!found) {
				temp.add(args[i]);
			}
			elenco = temp;
		}
		for (String elem: elenco) {
			System.out.print(elem+" ");
		}
		System.out.print("\n");
		
		
		
		ArrayList<String> vinciFacile = new ArrayList<String>();
		for (String elem: args) {
			vinciFacile.add(elem);
		}
		
		Collections.sort(vinciFacile);
		
		
		System.out.print("vinciFacile\n");
		for (String elem: vinciFacile) {
			System.out.print(elem+" ");
		}
		System.out.print("\n");
		
		Arrays.sort(args);
		System.out.print("ancoraMeglio\n");
		for (String elem: args) {
			System.out.print(elem+" ");
		}
		System.out.print("\n");
		
		
		
		
	}
}
