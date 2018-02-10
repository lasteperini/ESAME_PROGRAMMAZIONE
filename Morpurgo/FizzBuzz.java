import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numero;
	
		do {
			System.out.println("Numero?");
			
			numero = in.nextInt();
			if (numero != 0)
				if (numero%3 ==0) 
					System.out.println("	Fizz");
				else
					if (numero%5 == 0)
						System.out.println("	Buzz");
					else
						System.out.println("	"+numero);
		} while (numero != 0);
				
		
	
	}

}
