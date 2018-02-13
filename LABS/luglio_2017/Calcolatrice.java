import java.util.Scanner;


public class Calcolatrice {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		String comando = in.nextLine();
		double valueS = 0.0, newvalue, calc;
		
		while (comando.length() > 0 && comando.charAt(0) != 'E') {
			
			char c = comando.charAt(0);
			String[] lista = comando.split(" ");
			if (lista.length == 2 || lista[0].length() == 1) {
				
			
				switch (c) {
					case 'S':  	valueS = (double) Integer.parseInt(lista[1]);
								System.out.println("= " + valueS);
								break;
					case '*':  	newvalue = (double) Integer.parseInt(lista[1]);
								calc = valueS * newvalue;
								valueS = calc;
								System.out.println("= " + calc);						
								break;
					case '/':  	newvalue = (double) Integer.parseInt(lista[1]);
								calc = valueS / newvalue;
								valueS = calc;
								System.out.println("= " + calc);						
								break;
					case '+':  	newvalue = (double) Integer.parseInt(lista[1]);
								calc = valueS + newvalue;
								valueS = calc;
								System.out.println("= " + calc);							
								break;
					case '-':  	newvalue = (double) Integer.parseInt(lista[1]);
								calc = valueS - newvalue;
								valueS = calc;
								System.out.println("= " + calc);							
								break;
				}
			}
			
			comando = in.nextLine();
			
		}
		
		return;
		
	}

}
