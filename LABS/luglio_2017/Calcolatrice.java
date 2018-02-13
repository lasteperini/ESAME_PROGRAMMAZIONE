import java.util.Scanner;

public class Calcolatrice {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double S = 0.0;
		String check = "";
		
		while (in.hasNextLine() {
			String input = in.nextLine();
			String[] comandi =  input.split(" ");
			check = comandi[0];
			
			
				Double operando = Double.parseDouble(comandi[1]);
				
				switch (comandi[0].charAt(0)) {
					case '+': S = S + operando;
					break;
					case '-': S = S - operando;
					break;
					case '*': S = S * operando;
					break;
					case '/': S = S / operando;
					break;
					case 'E': return;
					break;
					default:
					
				}
				
				System.out.println("= "+ S);
		} 
			
				
		
	}
	
	
	
}
