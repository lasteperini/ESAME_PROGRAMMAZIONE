import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * @author Lavinia Fabrello
 * @version Esame 29-01-18
 */
 

public class Dispensa {
	
	HashMap<Prodotto, Integer> dispensa;
	HashMap<Prodotto, Integer> scorta;
	
	// costruttore
	/** Crea un oggetto Dispensa vuoto
	 */
	public Dispensa () {
		this.dispensa = new HashMap<Prodotto, Integer>();
		this.scorta = new HashMap<Prodotto, Integer>();	
	}
	
	// Override di toString()
	/**
	 * Restituisce l'elenco degli oggetti Prodotto presenti in Dispensa e la loro quantita' minima
	 * 
	 * @return String
	 */
	
	@Override	
	public String toString () {
		String s = "";
		for (Prodotto p:this.dispensa.keySet()) {
			s = s+"\n"+p.toString()+":\tcontenuto in dispensa "+this.qta(p)+"\tscorta minima "+this.getMinimo(p);
		}
		return s;
	}

	// metodi previsti dalle specifiche
	/**
	 * Inserisce il valore minimo per Prodotto presente in Dispensa
	 * 
	 * @param p Prodotto 
	 * @param q quantita' minima che deve essere presente in Dispensa
	 */
	public void scortaMinima(Prodotto p, int q) {
		this.scorta.put(p,q);
	}
	
	/**
	 * Restituisce la quantita di Prodotto presente in Dispensa
	 * 
	 * @param p Prodotto
	 * @return int
	 */
	public int qta(Prodotto p) {
		if (this.dispensa.containsKey(p)) {
			return this.dispensa.get(p);
		} else {
			return 0;
		}		
	}

	/**
	 * Rimuove la quantita int di Prodotto  dalla dispensa
	 * 
	 * @param p Prodotto
	 * @param q int
	 */
	public void consuma(Prodotto p, int q) {
		if (this.qta(p) > q) {
			int nuovoValore = this.qta(p)-q;
			this.dispensa.put(p,nuovoValore);
		} else {
			throw new NoSuchElementException();
		}
	}
	
	
	/**
	 * Crea una ListaDellaSpesa contenente elementi Prodotto che sono presenti in Dispensa in quantita inferiore al minimo
	 * 
	 * @return ListaDellaSpesa
	 */
	public ListaDellaSpesa preparaLista() {
		ListaDellaSpesa lista = new ListaDellaSpesa();
		for (Prodotto p:this.dispensa.keySet()) {
			if (this.qta(p) < this.getMinimo(p)) {
				int nuovoValore = this.getMinimo(p)-this.qta(p);
				lista.aggiungi(p,nuovoValore);
			}				
		}
		return lista;
	}

	/**
	 * Aggiunge la quantita int di un oggetto Prodotto presente il ListaDellaSpesa alla Dispensa
	 * 
	 * @param lista ListaDellaSpesa
	 */
	public void riponi(ListaDellaSpesa lista) {
		for (Prodotto p:lista.prodotti()) {
			int q = lista.qta(p);
			int nuovoValore = this.qta(p)+q;
			this.dispensa.put(p,nuovoValore);
		}
	}


	
	// metodi di accesso alle variabili
	
	/**
	 * Restituisce la quantita minima di un oggetto Prodotto presente in Dispensa
	 * 
	 * @param p Prodotto
	 * @return int 
	 */
	public int getMinimo(Prodotto p) {
		if (this.scorta.containsKey(p)) {
			return this.scorta.get(p);
		} else {
			return 0;
		}
	}

	


}
