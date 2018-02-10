import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortParole {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<String> arraySorted = new ArrayList<String>();
		
		while (in.hasNext()) {
			String parola = in.next();
			arraySorted.add(parola);
		}
		
		Collections.sort(arraySorted);
		
		for (String elem:arraySorted) {
			System.out.println(elem);
		}
		
		
	}
	
}
