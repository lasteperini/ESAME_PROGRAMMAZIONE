import java.util.ArrayList;

public class Reparto {
	
	private String nomeReparto = null;
	private String nominativoResponsabile = null;
	
	// costruttore	
	public Reparto (String nome, String nominativo) {
		this.nomeReparto = nome;
		this.nominativoResponsabile = nominativo;
	}
	
	// metodo toString		
	public String toString () {
		return this.nomeReparto;
	}

	@Override		
	public boolean equals (Object obj) {
		if (obj == null) {
			return false;
		}
		if (!Reparto.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		final Reparto other = (Reparto) obj;
		if ((this.nomeReparto == null) ? (other.nomeReparto != null) : !this.nomeReparto.equals(other.nomeReparto)) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 53 * hash + (this.nomeReparto != null ? this.nomeReparto.hashCode() : 0);
		return hash;
	}


		
}
	

