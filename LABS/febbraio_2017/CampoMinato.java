import java.util.Scanner;

public class CampoMinato {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int riga = 0;
		Character[][] contenuto = new Character[100][100];
		
		int n = Integer.parseInt(args[0]);
		
		// leggo l'input e costruisco l'array bidimensionale
		
		while (riga < n && in.hasNextLine()) {
			String s = in.nextLine();
			for (int i = 0; i < n; i++) {
				char c = s.charAt(i);
				contenuto[riga][i] = c;
			}
			riga++;				
		}
		
		// analizzo l'array, per ogni elemento controllo le posizioni intorno
		
		for (int i = 0; i < n; i++ ) {
			for (int j = 0; j < n; j++) {
				if (contenuto[i][j] == '*') {
					// lo stampo
					System.out.print("*");
				} else {
					// controllo gli elementi intorno, se esistono
					int conta = 0 ;
					if (i > 0) {
						if (j > 0) {
							if (contenuto[i-1][j-1]== '*') {
								conta++;
							}
						}
						if (contenuto[i-1][j] == '*') {
							conta++;
						}
						if (j < n-1) {
							if (contenuto[i-1][j+1]== '*') {
								conta++;
							}
						}						
					}
					if (j > 0) {
						if (contenuto[i][j-1]== '*') {
							conta++;
						}
					}
					if (j < n-1) {
						if (contenuto[i][j+1]== '*') {
							conta++;
						}
					}						
					if (i < n-1) {
						if (j > 0) {
							if (contenuto[i+1][j-1]== '*') {
								conta++;
							}
						}
						if (contenuto[i+1][j] == '*') {
							conta++;
						}
						if (j < n-1) {
							if (contenuto[i+1][j+1]== '*') {
								conta++;
							}
						}						
					}
					System.out.print(conta);
						
				}
			}
			System.out.println();
		}
			
		
	}
}
