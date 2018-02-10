
public class Crivello {
	
	public static void main(String[] args) {
		
		final int N = 10;
		
		int[][] matrice = new int[N][N];
		
		for (int i=0; i< N;i++) {			
			int deca = i;			
			for (int j=0;j<N;j++) {		
				int unit = j;
				int value = (deca*10)+unit;
				matrice[i][j] = value;								
			}
		}
		stampa(matrice,N);
		
		int deca =0 , unit=2;
		for (int x = 2; x <=N*N; x++) {
			int mult = x;
			while (mult < N*N) {
				mult += x;
				if (mult<N*N) 
					deca = mult/10;
					unit=mult%10;
					matrice[deca][unit] =0;
			}
		}
			stampa(matrice,N);

			//System.out.println("stampa");
				
		
	}
		
	private static void stampa (int[][] m, int N) {
		
		//System.out.println("entra");
		for (int i=0; i< N;i++) {				
			for (int j=0;j<N;j++) {
		
				System.out.printf("%4d",m[i][j]);
				
			}
			System.out.println("\n");
		}
		for (int i=0; i<50;i++) 
			System.out.print("_");
			
			System.out.println("\n");
	
	}

		
					
		
	
	
	
}
