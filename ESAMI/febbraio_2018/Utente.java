public class Utente {
	private String nome;
	private String cognome;
	private Bicicletta bici;
	
	/** crea una Utente con inizialmente bici null
	 * 
	 * @param nome String
	 * @param cognome String
	 */ 
	public Utente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.bici = null;
	}

	/** crea una Utente nuovo a partire da un oggetto Utente
	 * 
	 * @param u Utente 
	 */ 
	
	public Utente(Utente u) {
		this.nome = u.nome;
		this.cognome = u.cognome;
		this.bici = u.bici;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Utente) {
			Utente altro = (Utente) obj;
			if (this.getNome().equals(altro.getNome()) && this.getCognome().equals(altro.getCognome())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	@Override 
	public int hashCode () {
			return 13*(this.getNome().hashCode()+this.getCognome().hashCode());
	}
	
	@Override 
	public String toString () {
			return "["+this.getNome()+" : "+ this.getCognome()+"]";
	}

	/** restituisce il nome dell'utente
	 * 
	 * @return nome String
	 */
	 public String getNome () {
			return this.nome;
	 } 
	 
	/** restituisce il cognome dell'utente
	 * 
	 * @return cognome String
	 */
	 public String getCognome () {
			return this.cognome;
	 } 
	 
	/** se attualmente questo utente ha in uso una bicicletta, il metodo
	 * la restituisce; altrimenti restituisce null
	 * 
	 * @return Bicicletta
	 */
	 public Bicicletta bicicletta() {
		 // restituisce già null se non è in pssesso dell'utente
		 return this.bici;
	 }
	 
	/** prende in uso la bicicletta indicata; solleva una
	 * IllegalStateException se l'utente ha già in uso un'altra bicicletta.
	 * 
	 * @param x Bicicletta
	 * @throws IllegalStateException
	 */
	 public void prendiInUso(Bicicletta x) throws IllegalStateException {
		if (this.bici == null) {
			this.bici = x;
		} else {
			throw new IllegalStateException();
		}
		 
	 }

	/** restituisce la bicicletta attualmente in uso
	 * solleva una IllegalStateException se l'utente non ha biciclette in uso.
	 * 
	 * @throws IllegalStateException
	 */ 
	 
	 public void restituisci() {
		if (this.bici != null) {
			this.bici = null;
		} else {
			throw new IllegalStateException();
		}
	 }
	 
	
}
