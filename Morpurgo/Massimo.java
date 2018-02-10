public class Massimo {

	public static void main(String[] args) {
	
		int lArray = args.length;
		int[] valori = new int[lArray];
		int i = 0;

		for(String elem: args) {
			valori[i] = Integer.parseInt(elem);
			i++;

		}
		
		int[] sottolista = sottolista(valori) ;
		int massimo = max(valori[0], sottolista);

		System.out.println(massimo);
	
	}
	
	private static int max(int valore, int[] lista) {
		
		if (valore < lista[0]) {
			valore = lista[0];
		}
			
		if (lista.length == 1) {
			return valore;
		} else {
			int[] sottolista = sottolista(lista);
			return max(valore,sottolista);
		}
	
	
	}
	
	
	private static int[] sottolista(int[] lista) {
		
		int[] sottolista = new int[lista.length -1];
		
		for(int i = 1;i < lista.length; i++) {
			sottolista [i-1] = lista[i];
		}
		
		return sottolista;
	
	}


}
