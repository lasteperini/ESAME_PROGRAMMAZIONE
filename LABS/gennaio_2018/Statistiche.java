
public class Statistiche {
	
	public static void main(String[] args) {
		int[] data = {1,1,3,2,4,5,1,4,6,7,3,5,5,8,9,10,0,0,2,1};
		int[] frequenza = frequenze(data);
		System.out.println("serie di dati:");
		for (int x : data)
			System.out.print(x+" ");
			System.out.println("\nfrequenze:");
		for (int i = 0; i < frequenza.length ; ++i)
			System.out.printf("%2d: %d\n", i, frequenza[i]);
		System.out.println("mediana: "+ mediana(data)+"\n"); // dovrebbe stampare 3.5
	}

	public static int[] frequenze(int[] data) {
		int lunghezza = data.length;
		int[] frequenza = new int[lunghezza];
		for (int i=0; i< lunghezza;i++) {
			int valore = data[i];
			if (frequenza[valore] != 0) {
				frequenza[valore]++;
			} else {
				frequenza[valore] = 1;
			}				
		}
		return frequenza;
	}
	
	public static double mediana(int[] data) {
		int[] frequenza = frequenze(data);
		int[] valoriOrdinati = new int[frequenza.length];
		int contatore = 0;
		double mediana;
		
		for (int i=0; i< frequenza.length; i++) {
			for (int j = 0; j < frequenza[i];j++) {
				valoriOrdinati[contatore] = i;
				contatore++;
			}
		}
		
		if (valoriOrdinati.length%2 ==0) {
			mediana = (valoriOrdinati[(valoriOrdinati.length/2)-1] + valoriOrdinati[valoriOrdinati.length/2])/2.0;
		} else {
			mediana = valoriOrdinati[valoriOrdinati.length/2];
		}
		
		return mediana;
		
	}

	
}
