import java.lang.System;


public class Triangolo {

	int numeroAngolare = 0;

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int valore = Calcola(n);
		System.out.println(valore);

	}

	public static int Calcola(int n) {

		int numeroAngolare = 0;

		if (n == 0) {
			numeroAngolare = 0;
			return 0;
		}	

		if ( n > 0) {
			numeroAngolare = n+Triangolo.Calcola(n-1);

		}

		return numeroAngolare;
	

	}



}
