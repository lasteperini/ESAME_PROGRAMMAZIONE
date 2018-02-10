public class CoefficienteBinomiale {

	public static void main(String[] args) {
		
		if (args.length != 2) {
			return;
		}
		
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		
		int coeff = calcolaCoeff(n,k);
		
		System.out.println(coeff);
	}
	
	private static int calcolaCoeff(int n, int k) {
		if (k==0)
			return 1;		
		if (n==0)
			return 0;

		
		int coeff = calcolaCoeff(n-1,k-1) + calcolaCoeff(n-1,k);
		
		return coeff;
	}

}
