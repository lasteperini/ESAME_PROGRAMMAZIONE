public class Citta {
	
	private String nome;
	private Risorsa risorsa;
	
	public Citta (String nome, Risorsa risorsa) {
		this.nome = nome;
		this.risorsa = risorsa;
	}
	
	@Override 
	public String toString () {
		return "[citta: "+this.nome+", risorsa: "+this.risorsa.toString()+"]";
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj == null) {
			return false;
		}
		if ((obj instanceof Citta)) {
		
			Citta other = (Citta) obj;
		
			if (this.nome.equals(other.nome)) {
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
		int h = 31*this.nome.hashCode() + this.risorsa.hashCode();
		return h;
	}
	
	public Risorsa produci () {
		return new Risorsa(this.risorsa.getNome(),this.risorsa.getPrezzo());
	}
	
}
