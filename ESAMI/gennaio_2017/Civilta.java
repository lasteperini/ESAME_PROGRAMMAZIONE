import java.util.ArrayList;

public class Civilta {
	
	private String nome;
	private ArrayList<Citta> arrayCitta;
	private int tesoro;
	private ArrayList<Risorsa> stock;
	
	public Civilta (String nome) {
		this.nome = nome;
		this.arrayCitta = new ArrayList<Citta>();
		this.tesoro = 0;
		this.stock = new ArrayList<Risorsa>();
	}
	
	@Override 
	public String toString () {
		return this.nome;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Civilta)) return false;
		
		Civilta civilta = (Civilta) obj;
		
		if (this.nome.equals(civilta.nome)) return true;
		else return false;
	}
	
	@Override 
	public int hashCode () {
		int h = 13*this.nome.hashCode() + this.tesoro;
		return h;
	}
	
	public ArrayList<Citta> getCittaList () {
		return this.arrayCitta;
	}
		
	public Citta fondaCitta (String nomeCitta, Risorsa risorsa) {
		Citta citta = new Citta(nomeCitta, risorsa);
		this.aggiungiCitta(citta);
		return citta;
	}
	
	public void aggiungiRisorsa (Risorsa risorsa) {
		this.stock.add(risorsa);
	}
	
	public void rimuoviRisorsa (Risorsa risorsa) {
		this.stock.remove(risorsa);
	}
	
	public void aggiungiCitta (Citta citta) {
		this.arrayCitta.add(citta);
		this.aggiungiRisorsa(citta.produci());
	}
	
	public void rimuoviCitta (Citta citta) {
		this.arrayCitta.remove(citta);
		this.rimuoviRisorsa(citta.produci());
	}
	
	public void aggiungiDenaro (int denaro) {
		this.tesoro += denaro;
		//System.out.println("Ora il tesoro di " + this+" vale "+ tesoro);
	}
	
	public void togliDenaro (int denaro) {
		this.tesoro -= denaro;
		//System.out.println("Ora il tesoro di " + this+" vale "+ tesoro);
	}
	
	public int getTesoro () {
		return this.tesoro;
	}
	
	public ArrayList<Risorsa> getRisorse () {
		return this.stock;
	}
	
	public void faiProdurre () {
		for(Citta elem: arrayCitta) {
			Risorsa risorsa = elem.produci();
			if (!this.possiede(risorsa)) {
				this.aggiungiRisorsa(risorsa);
			}
		}		
	}
	
	public boolean  possiede (Risorsa risorsa) {
		if (this.stock.contains(risorsa)) 
			return true;
		else
			return false;
	}
	
	public boolean vendiRisorseA (Civilta altra) {
		boolean possiede = false;
		ArrayList<Risorsa> daRimuovere = new ArrayList<Risorsa>();
		for (Risorsa elem:this.getRisorse()) {
			if (!altra.possiede(elem)) {
				possiede = true;
				altra.aggiungiRisorsa(elem);
				daRimuovere.add(elem);
				//System.out.println(this+" vende a "+altra+" "+ elem+" che vale "+ elem.getPrezzo());
				altra.togliDenaro(elem.getPrezzo());
				this.aggiungiDenaro(elem.getPrezzo());
			}
		}
		for (Risorsa elem: daRimuovere) {
			this.rimuoviRisorsa(elem);
		}
		
		return possiede;
	
	}
	
	
	
}
