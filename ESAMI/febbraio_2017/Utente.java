
public class Utente {
	private String nome;
	private String cognome;
	private Data nascita;
	private int cf;
	
	
	public Utente (String nome, String cognome, Data nascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
		this.cf = this.hashCode();
	}
	
	@Override	
	public int hashCode () {
		int prime = 17;
		int h = this.nome.hashCode()+this.cognome.hashCode(); 	
		return -h*prime;
	}

	@Override	
	public boolean equals (Object obj) {
		if (obj instanceof Utente) {
			Utente altro = (Utente) obj;
			if (this.cf == altro.cf) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}

	@Override
	public String toString () {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[nome: ");
		sb.append(this.nome+",");
		sb.append("cognome: ");
		sb.append(this.cognome+",");
		sb.append("data di nascita: ");
		sb.append(this.nascita.toString()+",");
		sb.append("cf: "+this.cf+"]");
		
		return sb.toString();		
		
	}
	
}
