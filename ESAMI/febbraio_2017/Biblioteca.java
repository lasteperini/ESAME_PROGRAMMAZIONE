import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Libro> libri;
	private ArrayList<Utente> utenti;
	private ArrayList<Prestito> prestiti;
	
	public Biblioteca (String nome) {
		this.nome = nome;
		this.libri = new ArrayList<Libro>();
		this.utenti = new ArrayList<Utente>();
		this.prestiti = new ArrayList<Prestito>();
	}
	
	public void nuovoUtente(Utente x) {
		if (!this.utenti.contains(x))
			this.utenti.add(x);	
	}
	
	public void nuovoLibro(Libro x) {
		if (!this.libri.contains(x))
			this.libri.add(x);	
	}

	public void nuovoPrestito(Prestito x) {
		if (!this.prestiti.contains(x))
			this.prestiti.add(x);	
	}
	
	public int numeroUtenti() {
		return this.utenti.size();
	}

	public int numeroLibri() {
		return this.libri.size();
	}
	
	public ArrayList<Libro> cercaLibro(String x) {
		ArrayList<Libro> trovati = new ArrayList<Libro>();
		for (Libro elem : this.libri) {
			if (elem.getTitolo().indexOf(x) >= 0) {
				trovati.add(elem);
			}
		} 
		return trovati;
	}
	
	public boolean disponibile(Libro x) {
		if (!x.isPrestabile()) 
			return false;
		
		Data oggi = new Data();
		
		for (Prestito p: this.prestiti) 
			if (p.riguardaLibro(x) && p.riguardaData(oggi))
				return false;
		
		
		return true;
	}
	
	public int quantiPrestiti(Utente x) {
		int counter = 0;
		for (Prestito p: this.prestiti) 
			if (p.getUtente().equals(x)) 
				counter++;
		
		return counter;
	}
	
	public boolean daiInPrestito(Libro x, Utente u, Data finoA) {
		if (!this.disponibile(x)) 
			return false;
		
		if (this.quantiPrestiti(u) > 3)
			return false;
		
		Data oggi = new Data();
	
		Prestito p = new Prestito (x,u,oggi,finoA);
		
		this.nuovoPrestito(p);
		
		return true;
		
		
	}

	public boolean daiInPrestito(Libro x, Utente u) {
		if (!this.disponibile(x)) 
			return false;
		
		if (this.quantiPrestiti(u) > 3)
			return false;
		
		Data oggi = new Data();
	
		Prestito p = new Prestito (x,u,oggi,oggi.successiva());
		
		this.nuovoPrestito(p);
		
		return true;
		
		
	}
	
	public Utente chiHaInPrestito(Libro x) {
		for (Prestito p: this.prestiti) 
			if (p.riguardaLibro(x)) 
				return p.getUtente();
		
		return null;
	}
	
	@Override 
	public String toString () {
		return this.nome;
	}
}
