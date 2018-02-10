import java.util.ArrayList;

public class Prodotto {
	
	private String nome = null;
	private Reparto reparto = null;
	private String id = null;
	private double quantita = 0.0;
	private double prezzo = 0.0;
	private UnitaDiMisura mis = null;
	
	// costruttore	
	public Prodotto (String n,Reparto r,String i,double q,double p,UnitaDiMisura m) {
		this.nome = n;
		this.reparto = r;
		this.id = i;
		this.quantita = q;
		this.prezzo = p;
		this.mis = m;
	}
	
	public double prezzo () {
		return this.prezzo;
	}
	
	public double prezzoUnitario () {
		double qta = this.mis.qta();		
		double prezzoUnitario = (qta*this.prezzo)/this.quantita;		
		return prezzoUnitario;	
	}
	
	
	
	
	
}
