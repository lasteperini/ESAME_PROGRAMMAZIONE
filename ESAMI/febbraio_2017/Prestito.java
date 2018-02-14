public class Prestito {
	private Libro libro;
	private Utente utente;
	private Data partenza;
	private Data arrivo;

		
	
	public Prestito (Libro x, Utente u, Data da, Data a) {
		this.libro = x;
		this.utente = u;
		this.partenza = da;
		this.arrivo = a;
	}

	public Prestito (Libro x, Utente u, Data da) {
		this.libro = x;
		this.utente = u;
		this.partenza = da;
		this.arrivo = this.partenza.successiva();
	}
	
	public boolean riguardaLibro(Libro t) {
		if (this.libro.equals(t)) 
			return true;
		
		return false;
	}
	
	public boolean riguardaData(Data d) {
		if (d.vienePrimaDi(this.partenza) && !d.vienePrimaDi(this.arrivo))
			return true;
		
		return false;
	}
	
	public Utente getUtente () {
		return this.utente;
	}
		
}
