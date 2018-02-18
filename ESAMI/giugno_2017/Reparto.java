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
		if (obj instanceof Reparto ) {
			Reparto other = (Reparto) obj;
			if (this.nomeReparto.equals(other.nomeReparto)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		int hash = 53 * this.nomeReparto.hashCode();
		return hash;
	}


		
}
