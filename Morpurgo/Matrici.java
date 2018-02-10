import java.util.Random;

public class Matrici {
	
	public static void main(String[] args) {
		
		int n = Integer.valueOf(args[0]);
		int m = Integer.valueOf(args[1]);
		int max = Integer.valueOf(args[2]);
		
		int[][] matrice = new int[m][n];
		
		Random random = new Random();
		
		for (int i=0; i< m;i++) {
			for (int j=0;j<n;j++) {
				
				matrice[i][j] = random.nextInt(max);
				
				System.out.print("\t"+matrice[i][j]);
				
			}
			
			System.out.println("\n");
			
		}
		
		
			
		
					
		
	
	}
	
}
