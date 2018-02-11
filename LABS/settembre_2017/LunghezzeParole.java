import java.util.Scanner;

public class LunghezzeParole {

	public static void main(String[] args) {
		int somma = 0,counter = 0,max = 0,min = Integer.MAX_VALUE,media = 0;
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			String s = in.next();
			
			if (max < s.length())
				max = s.length();

			if (min > s.length())
				min = s.length();

			somma += s.length();

			counter++;
		}

		media = somma/counter;

		System.out.println("max: "+max);
		System.out.println("med: "+media);
		System.out.println("min: "+min);
	}

}
