import java.lang.System;
import java.util.Scanner;

public class TrovaParole {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i,j,inputLength, inLength;
		String[] input = new String[args.length];
		String linea; 
		String[] output = new String[args.length];
		for (i =0; i < args.length; i++) {
			output[i] = " 0";
		}

		while (in.hasNextLine()) {
			linea = in.nextLine();
			input = linea.split(" ");
			for (j=0; j < input.length;j++) {
				inputLength = input[j].length();
				for (i =0; i < args.length; i++) {
					String check = args[i];
					inLength = check.length();
					if (inLength == inputLength) {
						output[i] = " +";
					} 
				}
			}
		}

		
		if (input != null && output != null) {
			for (i =0; i < args.length; i++) {

				System.out.println(args[i] + ":" + output[i]);
	
			}
		}

	}


}
