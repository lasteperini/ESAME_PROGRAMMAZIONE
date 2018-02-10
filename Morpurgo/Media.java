import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int count = 0, somma = 0;
		
		while(in.hasNext()) {
			int i = in.nextInt();
			somma += i;
			count++;
		}
		
		double media = (double) somma/ (double) count;
		
		System.out.println("La media e': "+media);
	}
	
	
}
