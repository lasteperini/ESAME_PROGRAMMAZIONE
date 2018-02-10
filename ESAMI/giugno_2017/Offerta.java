
public class Offerta {
	private String nomeOfferta = null;
	private Prodotto prodotto = null;
	double percSconto = 0.0;
	int numMinimo = 1;
	boolean soloCartaFedelta = false;
	
	// costruttore	
	public Offerta (String n,Prodotto pr,double ps,int min,boolean cf) {
		this.nomeOfferta = n;
		this.prodotto = pr;
		this.percSconto = ps;
		this.numMinimo = min;
		this.soloCartaFedelta = cf;
	}
	
	public double prezzo (int qta,boolean carta) {
		double sconto;
		double prezzoSenzaOfferta = this.prodotto.prezzo();
		double prezzoConOfferta = prezzoSenzaOfferta;
		
		if (this.soloCartaFedelta && !carta) 
			sconto = 0.0;
		else
			sconto = this.percSconto;
			
		double fattoreUnitarioSconto = (100.0-sconto)/100.0;
		
		if (qta >= this.numMinimo) 
			prezzoConOfferta = qta*prezzoSenzaOfferta*fattoreUnitarioSconto;
		else 
			prezzoConOfferta = qta*prezzoSenzaOfferta;
		
		
		return prezzoConOfferta;
	}
	
}
