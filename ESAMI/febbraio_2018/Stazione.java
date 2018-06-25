import java.math.*;

public class Stazione {
	
	private String nome;
	private double x;
	private double y;
	private Bicicletta[] biciclette;
	private boolean elettriche;
	
	
	/** crea una Stazione con nome dato, localizzata nel punto (x,y), 
	 * e avente un certo numero di posizioni (inizialmente tutte vuote); 
	 * il booleano indica se la stazione può ospitare biciclette elettriche.
	 * 
	 * @param nome String
	 * @param x double
	 * @param y double
	 * @param posizioni int
	 * @param elettriche boolean
	 */ 
	public Stazione(String nome, double x, double y, int posizioni, boolean elettriche) {
		this.nome = nome;
		this.x = x;
		this.y = y;
		this.biciclette = new Bicicletta[posizioni];
		this.elettriche = elettriche;		
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Stazione) {
			Stazione altro = (Stazione) obj;
			// decido che 2 stazioni sono uguali se si trovano nella medesima posizione x,y
			// per la differenza tra double per evitare problemi di arrotondamento valuto che i 2 double
			// siano inferiori ad un numero molto basso
			double diffX = this.x - altro.x;
			double diffY = this.y - altro.y;
			if ( diffX < 0.00001 && diffY < 0.00001) {
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
			return  13*((int) this.x + (int) this.y) ;
	}
	
	@Override 
	public String toString () {
			return "["+this.getNome()+" : "+this.x+","+this.y+"]";
	}
	
	/** restituisce il nome della Stazione.
	 * 
	 * @return String nome
	 */
	  
	public String getNome () {
		return this.nome;
	}

	/** restituisce il numero di posizioni totali.
	 * 
	 * @return int
	 */
	  
	public int nPosizioni() {
		return this.biciclette.length;
	}
	
	
	/** restituisce il numero di posizioni occupate.
	 * 
	 * @return int
	 */
	
	public int nBiciclette() {
		int num = 0;
		for (int i = 0; i < this.biciclette.length; i++) {
			if (biciclette[i] != null) {
				num++;
			}
		}
		
		return num;
		
	}
	
	/** dice se questa stazione è attualmente piena.
	 * 
	 * @return boolean
	 */
	public boolean piena() {	
			return this.nPosizioni() == this.nBiciclette();
	}
	
	/** dice se questa stazione è attualmente vuota.
	 * 
	 * @return boolean
	 */
	public boolean vuota() {
		return this.nBiciclette() == 0;
	}
	
	/** dice se questa stazione è in grado di ospitare biciclette elettriche.
	 * 
	 * @return boolean
	 */
	public boolean ammetteElettriche() {
		return this.elettriche;
	}
	
	/** dice se questa stazione contiene al momento almeno una bicicletta elettrica
	 * 
	 * @return boolean
	 */
	public boolean ciSonoElettriche() {
		if (this.ammetteElettriche()) {
			for (int i = 0; i < this.nBiciclette(); i++) {
				if (biciclette[i] != null) {
					if (biciclette[i].elettrica()) {
						return true;
					}
				}
			}			
		}
		return false;
	}
	
	/** restituisce la bicicletta attualmente agganciata alla posizione i 
	 * (che deve essere un numero compreso fra 0 e nPosizioni()-1 . Restituisce null se
	 * la posizione è vuota.
	 * 
	 * @param i int;
	 * @return Bicicletta;
	 */
	  
	public Bicicletta posizione(int i) {
		if (i < this.nPosizioni()) {
			return this.biciclette[i];
		} else {
			return null;
		}
		
	}
	
	/** l'utente u aggancia la bicicletta che ha in uso la bicicletta in posizione i . 
	 * Solleva una IllegalStateException se la posizione i è già occupata o
	 * se l'utente non ha in uso biciclette.
	 * 
	 * @param u Utente
	 * @param i int
	 * @throws IllegalStateException
	 */ 
	
	public void aggancia(Utente u, int i) throws IllegalStateException {
		Bicicletta bici = u.bicicletta();
		if (bici != null && biciclette[i] == null) {
			this.biciclette[i] = bici;
			// aggiunto post esame
			bici.restituisci();
			//
			u.restituisci();
		} else {
			throw new IllegalStateException();
		}
	
	}
	
	/** l'utente u sgancia e prende la bicicletta in posizione i . 
	 * Solleva una IllegalStateException se la posizione i è vuota o se 
	 * l'utente ha già in uso una bicicletta. 
	 * Si occupa di registrare sia nella bicicletta sia nell'utente 
	 * coinvolti il fatto che ora l'utente ha quella bicicletta in uso e che quella bicicletta è ora in uso a quell'utente
	 * 
	 * @param u Utente
	 * @param i int
	 * @throws IllegalStateException
	 */ 
	 
	 public void prendi(Utente u, int i) {
		 
		Bicicletta bici = this.biciclette[i];
		 
		if (biciclette[i] != null) {
			// aggiunto post esame
			bici.daiInUso()
			//
								
			u.prendiInUso(bici);
			this.biciclette[i] = null;
		} else {
			throw new IllegalStateException();
		}
	}
	
	/** restituisce la prima posizione che contiene una bicicletta 
	 * (se elettica è true considera solo biciclette elettriche; altrimenti considera tutte le biciclette).
	 * Restituisce -1 se la stazione non contiene biciclette di quel tipo.
	 * 
	 * @param elettrica boolean
	 * @return int
	 */ 
	public int disponibile(boolean elettrica) {
		if (elettrica && this.ciSonoElettriche()) {
			for (int i = 0; i < this.nBiciclette(); i++) {
				if (biciclette[i] != null) {
					if (biciclette[i].elettrica()) {
						return i;
					}
				}
			}			
		} else {
			for (int i = 0; i < this.nBiciclette(); i++) {
				if (biciclette[i] != null) {
					return i;
				}
			}
		}
		
		return -1;			
		
	}
	
	/** restituisce la prima posizione che contiene una bicicletta 
	 * (se elettica è true considera solo biciclette elettriche; altrimenti considera tutte le biciclette).
	 * Restituisce -1 se la stazione non contiene biciclette di quel tipo.
	 * 
	 * @param x double
	 * @param y double
	 * @return double
	 */ 
	public double distanzaDa(double x, double y) {
		// distanza: utilizzo pitagora
		return Math.sqrt(square(this.x-x)+square(this.y-y)); 
		
	}
	
	private double square (double x) {
		return x*x;
	}
	
	/** cerca e restituisce, fra le stazioni dell'array s , quella più vicina al punto (x,y) e avente disponibilità di
	 * biciclette (se elettica è true considera solo biciclette elettriche; altrimenti considera tutte le biciclette).
	 * Restituisce null se non c'è alcuna stazione che soddisfa il criterio.
	 * 
	 * @param s Stazione[]
	 * @param elettrica elettrica
	 * @param x double
	 * @param y double
	 * @return Stazione
	 */ 
	public static Stazione cerca(Stazione[] s, boolean elettrica, double x, double y) {
		double min = Double.MAX_VALUE;
		boolean trovata = false;
		Stazione vicina = s[0];
		
		if (elettrica) {
			for (Stazione stazione: s) {
				if (stazione.ciSonoElettriche() ) {
					if (stazione.distanzaDa(x,y) < min) {
						min = stazione.distanzaDa(x,y);
						vicina = stazione;
						trovata = true;
					}
				}
			}
		} else {
			for (Stazione stazione: s) {
				if (stazione.distanzaDa(x,y) < min) {
					min = stazione.distanzaDa(x,y);
					trovata = true;
					vicina = stazione;
				}
			}
		}
		if (trovata) {
			return vicina;
		} else {
			return null;
		}
			
	}
}
