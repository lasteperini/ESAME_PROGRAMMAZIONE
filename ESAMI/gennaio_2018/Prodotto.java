/**
 * @author Lavinia Fabrello
 * @version Esame 29-01-18
 */
 
public class Prodotto {
	
	private String nome;
	
	/** Costruttore unico, richiede una String per il nome, verra' gestito in maniera case insensitive
	 * 
	 * @param  nome String nome di Prodotto
	 * */
	public Prodotto (String nome) {
		this.nome = nome.toLowerCase();
	}
	
	// Override di equals(), hashCode() e toString()
	/**
	 * Compara un oggetto Object e un Prodotto, la comparazione dei nomi avviene in modo case insensitive
	 * 
	 * @param obj Object con cui viene comparato Prodotto
	 * @return boolean
	 */
	@Override
	public boolean equals (Object obj) {
		if (obj == null) 
			return false;
		if (obj == this) 
			return true;
		if (obj instanceof Prodotto) {
			Prodotto p = (Prodotto) obj;
			if (this.getNome().equals(p.getNome())) {
				return true;
			}
		} 
		return false; 
	}

	/**
	 * Restituisce l'hashCode di Prodotto 
	 * 
	 * @return int
	 */
	
	@Override
	public int hashCode () {
		int prime = 11;
		int h = prime*this.nome.hashCode();
		return h;
	}
	
	/**
	 * Stampa la stringa che rappresenta Prodotto
	 * 
	 * @return nome
	 */
	@Override
	public String toString () {
		return this.nome;
	}
	
	// metodi di accesso alle variabili
	/**
	 * Restituisce String mome del Prodotto case insensitive
	 * 
	 * @return nome tipo String
	 */
	public String getNome() {
		return this.nome;
	}
	
	
}
