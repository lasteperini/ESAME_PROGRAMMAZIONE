public class Potenza {

	public static void main(String[] args) {
	
		//b^n = b * b^(n-1)
		
		int b = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		
		int risultato = eleva(b,n);
		
		System.out.println(risultato);
	
	}
	
	private static int eleva(int b, int n) {
	
		if (n > 0) 
			return b*eleva(b,n-1);
			// else
			return 1;
	
	}



}
