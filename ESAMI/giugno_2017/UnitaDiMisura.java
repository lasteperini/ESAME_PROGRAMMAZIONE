
public class UnitaDiMisura {
	private String nome;
	private String sigla;
	private UnitaDiMisura riferimento;
	private double qta;
	
	// costruttore nome, sigla	
	public UnitaDiMisura (String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
		this.riferimento = null;	
		this.qta = 1.0;
		
	}
	
	// costruttore nome, sigla, UnitaDiMisura, qta	
	public UnitaDiMisura (String nome, String sigla, UnitaDiMisura riferimento, double qta) {
		this.nome = nome;
		this.sigla = sigla;
		this.riferimento = riferimento;	
		this.qta = qta;
	}

	public UnitaDiMisura (UnitaDiMisura u) {
		this.nome = u.nome;
		this.sigla = u.sigla;
		this.riferimento = u.riferimento;	
		this.qta = u.qta;
	}
	
	// metodo toString	
	@Override		
	public String toString () {
		return "["+this.nome+" :"+this.sigla+"]";
	}

	// metodo equals		
	@Override		
	public boolean equals (Object obj) {
		if (obj != null) {
			if (obj instanceof UnitaDiMisura) {
				UnitaDiMisura other = (UnitaDiMisura) obj;
				if (this.getSigla().equals(other.getSigla()) && this.qta()==other.qta()) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public UnitaDiMisura riferimento () {
		if (this.riferimento == null) {
			return this;
		} else {
			return new UnitaDiMisura(this.riferimento);
		}
	}
	
	public double qta () {
		return this.qta;
	}
	
	public String getSigla() {
		return this.sigla;
	}
	
	
}
