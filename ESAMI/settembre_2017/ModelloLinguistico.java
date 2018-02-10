import java.lang.Math;
import java.util.HashMap;

public class ModelloLinguistico {
	
	//private ArrayList<Character> frequenzaCaratteri = new ArrayList<Character>();
	private int numeroTotaleCaratteri = 0;
	private HashMap<Character,Integer> collection = new HashMap<>();
	
	
	//crea un modello linguistico non addestrato su nessun testo
	public ModelloLinguistico() {}
	
	
	// crea un modello linguistico addestrato sul testo dato
	public ModelloLinguistico(String testo) {
		this.addestra(testo);
	}
	
	//mio personale toString
	@Override 
	public String toString() {
		if (this.collection.size()==0) {
			return "ModelloLinguistico vuoto";
		} else {
			return "ModelloLinguistico addestrato";
		}
	}
	
	//equals e hashCode
	@Override
	public boolean equals(Object obj) {
		if (obj == null) 
			return false;
		if (this == obj) 
			return true;
		if (obj instanceof ModelloLinguistico ) {
			ModelloLinguistico mod = (ModelloLinguistico) obj;
			if (this.differenza(mod) < 10E-6) 
				return true;
			else
				return false;
		} else {
			return false;
		}
	}
	
	@Override 
	public int hashCode() {
		int prime = 31;
		int h = 0;
		for(char c = 'a';c<='z';c++) {
			h = prime*h+collection.get(c);
		}
		return h;
	}
	
	
	// addestra il modello sul testo dato. Per farlo, considera uno
	// alla volta i caratteri del testo, ignorando quelli che non siano alfabetici. Ogni carattere alfabetico viene
	// minuscolizzato (ad es., 'A' viene convertito in 'a') e il contatore corrispondente viene incrementato
	public void addestra(String testo) {
		for(int i = 0; i< testo.length();i++) {
			Character c = Character.toLowerCase(testo.charAt(i));
			if(this.collection.get(c) == null) {
				this.collection.put(c,1);
			} else {
				int value = this.collection.get(c)+1;
				this.collection.put(c,value);
			}
			this.numeroTotaleCaratteri++;
				
		}
	}
	
	//restituisce il numero di caratteri alfabetici visti fino ad ora
	public int quantiCaratteri() {
		return this.numeroTotaleCaratteri;
	}
	
	// restituisce la frequenza assoluta del carattere c , se c
	// è una lettera alfabetica minuscola ('a'...'z'). Se c è un qualunque altro carattere, questo metodo
	// restituisce -1.
	public int frequenzaAssoluta(char c) {
		if(c >= 'a' && c <= 'z') {
			if (this.collection.get(c) == null) {
				return 0;
			} else {
				return this.collection.get(c);
			}
		} else {
			return -1;
		}
	}
	
	// se è stato visto almeno un carattere (cioè se
	// 	quantiCaratteri() restituisce un valore maggiore di zero), questo metodo restituisce la
	// frequenza relativa del carattere (cioè, la sua frequenza assoluta divisa per il numero di caratteri
	// alfabetici visti); in caso contrario, restituisce 1.0/26.
	public double frequenzaRelativa(char c) {
		if(this.quantiCaratteri()>0) {
			return (double) this.frequenzaAssoluta(c)/ (double) this.numeroTotaleCaratteri;
		} else {
			return 1.0/26;
		}
	}
	
	// calcola la differenza in norma L2 fra questo
	// modello linguistico e il modello linguistico m . Tale differenza si calcola come segue: per ogni
	// carattere alfabetico, si calcola la differenza fra la frequenza relativa di quel carattere nei due modelli
	// coinvolti (questo e m ), si eleva al quadrato questa differenza, e tali quadrati si sommano. Alla fine si
	// restituisce la radice quadrata della somma dei quadrati (metodo statico sqrt della classe Math ).
	public double differenza(ModelloLinguistico m) {
		double somma = 0.0;
		double quadrato = 0.0;
		for(char c='a';c <= 'z';c++) {
			double differenza = this.frequenzaRelativa(c) - m.frequenzaRelativa(c);
			quadrato = differenza*differenza;
			somma += quadrato;
		}		
		double sqrt = Math.sqrt(somma);
		return sqrt;
	}
	
}


