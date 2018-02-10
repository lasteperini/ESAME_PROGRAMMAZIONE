public class Citta {
	
	private String nome;
	private Risorsa risorsa;
	
	public Citta (String nome, Risorsa risorsa) {
		this.nome = nome;
		this.risorsa = risorsa;
	}
	
	@Override 
	public String toString () {
		return this.nome;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Citta)) return false;
		
		Citta citta = (Citta) obj;
		
		if (this.nome.equals(citta.nome)) return true;
		else return false;
	}
	
	@Override 
	public int hashCode () {
		int h = 31*this.nome.hashCode() + this.risorsa.hashCode();
		return h;
	}
	
	public Risorsa produci () {
		return this.risorsa;
	}
	
}
