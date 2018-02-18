public class Prodotto {
	
	private String nome;
	private Reparto reparto;
	private String id;
	private double quantita;
	private double prezzo;
	private UnitaDiMisura mis;
	
	// costruttore	
	public Prodotto (String nome,Reparto r,String id,double quantita,double prezzo,UnitaDiMisura m) {
		this.nome = nome;
		this.reparto = new Reparto(r);
		this.id = id;
		this.quantita = quantita;
		this.prezzo = prezzo;
		this.mis = new UnitaDiMisura(m);
	}
	
	public Prodotto (Prodotto p) {
		this.nome = p.nome;
		this.reparto = p.reparto;
		this.id = p.id;
		this.quantita = p.quantita;
		this.prezzo = p.prezzo;
		this.mis = p.mis;
	}

	public double prezzo () {
		return this.prezzo;
	}
	
	public double prezzoUnitario () {
		double qta = this.mis.qta();		
		double prezzoUnitario = (qta*this.prezzo)/this.quantita;		
		return prezzoUnitario;	
	}
	
	@Override 
	public String toString () {
		return this.nome;
	}
	
}
