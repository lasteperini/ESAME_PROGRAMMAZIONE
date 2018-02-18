public class Risorsa {
	
	private String nome;
	private int prezzo;
	
	public Risorsa (String nome,int prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	
	@Override	
	public String toString () {
		return "[risorsa: "+this.nome+", prezzo: "+this.prezzo+"]";
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj == null) 
			return false;
		if ((obj instanceof Risorsa)) {
		
			Risorsa other = (Risorsa) obj;
			
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
		int h = 11*this.nome.hashCode();
		return h;
	}
	
	public int getPrezzo () {
		return this.prezzo;
	}
	
	public String getNome () {
		return this.nome;
	}
	
		
}
