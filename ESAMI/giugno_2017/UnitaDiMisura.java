import java.util.ArrayList;

public class UnitaDiMisura {
	private String nome = null;
	private String sigla = null;
	private UnitaDiMisura riferimento = null;
	private double qta = 1.0;
	
	// costruttore nome, sigla	
	public UnitaDiMisura (String n, String s) {
		this.nome = n;
		this.sigla = s;
	}
	
	// costruttore nome, sigla, UnitaDiMisura, qta	
	public UnitaDiMisura (String n, String s, UnitaDiMisura r, double q) {
		this.nome = n;
		this.sigla = s;
		this.qta = q;
		this.riferimento = r;	
	}
	
	// metodo toString	
	@Override		
	public String toString () {
		return this.nome;
	}

	// metodo equals		
	@Override		
	public boolean equals (Object obj) {
		if (obj == null) {
			return false;
		}
		if (!UnitaDiMisura.class.isAssignableFrom(obj.getClass()) {
			return false;
		}
		final UnitaDiMisura other = (UnitaDiMisura) obj;
		if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
			return false
		}
		if ((this.sigla == null) ? (other.sigla != null) : !this.sigla.equals(other.sigla)) {
			return false
		}
		//errore
		if ((this.riferimento == null) ? (other.riferimento != null) : !this.riferimento.equals(other.riferimento)) {
			return false
		}
		if (this.qta != other.qta) {
			return false
		}
		return true;
	}
	
	public UnitaDiMisura riferimento () {
		return this.riferimento;
	}
	
	public double qta () {
		return this.qta;
	}
}
