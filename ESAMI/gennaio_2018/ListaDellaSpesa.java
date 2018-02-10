import java.util.HashMap;
import java.util.Collections;
/**
 * @author Lavinia Fabrello
 * @version Esame 29-01-18
 */
 

public class ListaDellaSpesa {
	
	HashMap<Prodotto, Integer> lista;
	
	/** Crea un oggetto ListaDellaSpesa vuoto
	 * 
	 */
	public ListaDellaSpesa () {
		this.lista = new HashMap<Prodotto, Integer>();
	}
	
	
	/**
	 * Aggiunge la quantita int di Prodotto p a ListaDellaSpesa
	 * 
	 * @param p Prodotto 
	 * @param q int 
	 */
	public void aggiungi(Prodotto p, int q) {
		this.lista.put(p,q);
	}
	
	/**
	 * Restituisce la quantita int di Prodotto p presente in ListaDellaSpesa
	 * 
	 * @param p Prodotto 
	 * @return int
	 */
	public int qta(Prodotto p) {
		if (this.lista.containsKey(p)) {
			return this.lista.get(p);
		} else {
			return 0;
		}
	}
	
	/**
	 * Restituisce la String s con l'elenco degli oggetti Prodotto presenti in Dispensa e la loro quantita' minima
	 * 
	 * @return String
	 */	
	@Override	
	public String toString () {
		String s = "";
		for (Prodotto p:this.lista.keySet()) {
			s = s+"\n"+p.toString()+"\tda acquistare "+this.qta(p);
		}
		return s;
	}

	
	/**
	 * Restituisce array Prodotto[] degli oggetti Prodotto presenti in ListaDellaSpesa
	 * 
	 * @return Prodotto[]
	 */
	public Prodotto[] prodotti() {
		Prodotto[] prodotti = this.lista.keySet().toArray(new Prodotto[] {});
		return prodotti;
	}
	
	

}
