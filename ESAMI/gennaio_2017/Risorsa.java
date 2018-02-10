public class Risorsa {
	
	private String nome;
	private int prezzo;
	
	public Risorsa (String nome,int prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	public Risorsa (String nome) {
		this.nome = nome;
		this.prezzo = 0;
	}
	
	@Override	
	public String toString () {
		return this.nome;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Risorsa)) return false;
		
		Risorsa ris = (Risorsa) obj;
		
		if (this.nome.equals(ris.nome)) return true;
		else return false;
	}
	
	@Override 
	public int hashCode () {
		int h = 11*this.nome.hashCode();
		return h;
	}
	
	public int getPrezzo () {
		return this.prezzo;
	}
	
	public void setPrezzo (int nuovoPrezzo) {
		this.prezzo = nuovoPrezzo;
	}
	
		
}
