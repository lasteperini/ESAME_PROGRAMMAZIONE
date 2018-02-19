public class Bicicletta {
	
	private String id;
	private boolean elettrica;
	private Utente utente ;
	
	
	/** crea una bicicletta con identificatore dato
	 * 
	 * @param id String
	 * @param elettrica boolean
	 */ 
	
	public Bicicletta (String id, boolean elettrica) {
		this.id = id;
		this.elettrica = elettrica;
		this.utente = null;		
	}
	
	/** dice se la bicicletta è elettrica.
	 * 
	 * @return boolean 
	 */
	  
	public boolean elettrica() {
			return this.elettrica;
	}
	
	/** dà in uso la bicicletta all'utente indicato
	 * 
	 * @param x Utente
	 * @throws IllegalStateException
	 */
	  
	public void daiInUso(Utente x) throws IllegalStateException {
		if (this.utente == null) {
			this.utente = x;
		} else {
			throw new IllegalStateException();
		}
		
	}
	
	/** restituisce Bicicletta
	 * 
	 * @throws IllegalStateException
	 */
	  
	public void restituisci() throws IllegalStateException {
		if (this.utente != null) {
			this.utente = null;
		} else {
			throw new IllegalStateException();
		}
		
	}
	
	/** se attualmente questa bicicletta è in uso a un utente, 
	 * restituisce l'utente che ce l'ha in uso
	 * 
	 * @return Utente
	 */
	  
	public Utente utente() {
		if (this.utente != null) {
			return new Utente(this.utente);
		} else {
			return null;
		}
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Bicicletta) {
			Bicicletta altro = (Bicicletta) obj;
			if (this.getId().equals(altro.getId())) {
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
			return 13*this.getId().hashCode();
	}
	
	@Override 
	public String toString () {
			return "["+this.getId()+" : elettrica "+this.elettrica()+", utente : "+ this.utente()+"]";
	}
	
	/** restituisce l'id della bicicletta
	 * 
	 * @return id String
	 */
	 
	 public String getId () {
			return this.id;
	 } 
	
}
