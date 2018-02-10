public class Palindroma {

	public static void main(String[] args) {
	
		// regola
		// frase 0 = p
		// frase 1 = p
		// frase 2 = p se p-1 e' palindroma e p e' palindroma
		
		String frase = args[0];
		
		boolean p = controlla(frase);
		
		if (p) {
			System.out.println(frase+" e' palindroma");
		} else {
			System.out.println(frase+" non e' palindroma");
		}
	
	
	}
	
	private static boolean controlla(String frase) {
		if (frase.length() == 1 || frase.length() == 0) 
			return true;
		if (frase.charAt(0) == frase.charAt(frase.length()-1) && controlla(frase.substring(1,frase.length()-1))) 
			return true;
			//else
			return false;
	}

}
