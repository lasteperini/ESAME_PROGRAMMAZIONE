import java.math.BigInteger;

public class Fattoriale {

	public static void main(String[] args) {
	
		//0! = 1
		//per n > 0, n! = n * (n-1)!
	
		BigInteger arg = new BigInteger(args[0]);
		long n = arg.longValue();
	
		long fatt = calcolaFattoriale(n);
	
		System.out.println("");
		System.out.println(fatt);
	
	}
	
	private static long calcolaFattoriale (long n) {
	
		System.out.print("*"+n);
		
		if (n > 0) 
			return n*calcolaFattoriale(n-1);
			// else
			return 1;	
	
	}


}
