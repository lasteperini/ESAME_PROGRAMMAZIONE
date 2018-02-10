import java.math.*;

public class Addestratore {
	final int LUNGHEZZA_ADDESTRATORE = 100;
	private String[] arrayLingue;
	private ModelloLinguistico[] arrayModelliLinguistici;

	// crea un addestratore vuoto
	public Addestratore() {
		this.arrayLingue = new String[LUNGHEZZA_ADDESTRATORE];
		this.arrayModelliLinguistici = new ModelloLinguistico[LUNGHEZZA_ADDESTRATORE];
		for (int i = 0; i<LUNGHEZZA_ADDESTRATORE;i++) {
			this.arrayLingue[i] = "";
			this.arrayModelliLinguistici[i] = new ModelloLinguistico();
		}
	}
	
	// se la lingua nomeLingua è
	// sconosciuta, crea un nuovo modello linguistico per quella lingua addestrandolo con il testo fornito; se
	// invece la lingua è già conosciuta, si usa il testo per addestrare ulteriormente il modello corrispondente
	public void addestra(String nomeLingua, String testo) {
		boolean addestrato = false;
		for (int i = 0; i<this.arrayLingue.length ; i++) {
			if (this.arrayLingue[i].equals(nomeLingua)) {
				System.out.println("Ripeto l'addestramento con "+ nomeLingua);				
				this.arrayModelliLinguistici[i].addestra(testo);
				addestrato = true;
				break;
			}
		}
		if (!addestrato) {
			boolean daAddestrare = true;
			for (int i = 0 ;  i < LUNGHEZZA_ADDESTRATORE ; i++) {
				if (this.arrayLingue[i].equals("")) {
					this.arrayModelliLinguistici[i].addestra(testo);
					this.arrayLingue[i] = nomeLingua;
					System.out.println("Addestrato con "+ nomeLingua);
					daAddestrare = false;
					break;
				}
			}
			if (daAddestrare) {
				System.out.println("Addestratore memory full");
				return;
			}
		}
			
	}
	
	// costruisce un modello linguistico per il testo passato
	// come argomento, e lo confronta (usando il metodo differenza ) con tutti i modelli di tutte le lingue
	// che in questo momento l'addestratore conosce. Restituisce il nome della lingua che ha dato luogo alla
	// differenza minima.
	public String classifica(String testo) {
		ModelloLinguistico compara = new ModelloLinguistico(testo);
		double min = (double) Double.MAX_VALUE;
		String lingua = "lingua non trovata";
		for (int i = 0; i<this.arrayModelliLinguistici.length ; i++) {
			if (arrayLingue[i] != "") {
				double sqrt = compara.differenza(arrayModelliLinguistici[i]);
				if ( sqrt < min) {
					min = sqrt;
					lingua = arrayLingue[i];
				}	
			}			
		}
		return lingua;
		
	}
	
	// stampa tutti gli istogrammi (di larghezza larg ) di tutte le lingue
	// conosciute, ognuno preceduto dal nome della lingua
	public void stampa(int larg) {
		for (int i = 0; i<this.arrayModelliLinguistici.length ; i++) {
			if (arrayLingue[i] != "") {
				Istogramma isto = new Istogramma(larg);
				System.out.println(arrayLingue[i]+":");
				System.out.println(isto.toString(arrayModelliLinguistici[i]));
			}
		}
	}
	
	public void stampaLingua(String lingua, char c) {
		for (int i = 0; i<this.arrayModelliLinguistici.length ; i++) {
			if (arrayLingue[i].equals(lingua)) {
				ModelloLinguistico m = arrayModelliLinguistici[i];
				System.out.print(arrayLingue[i]+":");
				double d = m.frequenzaRelativa(c)*100;
				System.out.println(c+" :"+ d +"%");
			}
		}
	}
}
