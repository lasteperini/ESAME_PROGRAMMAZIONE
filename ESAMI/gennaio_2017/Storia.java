import java.util.ArrayList;

public class Storia {
	
	private ArrayList<Civilta> arrayCivilta;
	
	public Storia (ArrayList<Civilta> listaCivilta) {
		this.arrayCivilta = listaCivilta;
	}
	
	public ArrayList<Civilta> getListaCivilta () {
		return this.arrayCivilta;
	}
	
	
	public void commercia () {
		for (Civilta c: this.arrayCivilta) {
			for (Civilta k: this.arrayCivilta) {
				if (!c.equals(k)) {
					if (c.vendiRisorseA(k))
						break;
				}
			}
		
		}
	}
	
	public Civilta piuRicca () {
		int max = Integer.MIN_VALUE;
		Civilta candidata = null;
		for (Civilta elem: this.arrayCivilta) {
			if (elem.getTesoro() > max) {
				max = elem.getTesoro();
				candidata = elem;
			}
		}
		return candidata;
	}
	
	
	public Civilta piuPovera () {
		int min = Integer.MAX_VALUE;		
		Civilta candidata = null;
		for (Civilta elem: this.arrayCivilta) {
			if (elem.getTesoro() < min) {
				min = elem.getTesoro();
				candidata = elem;
			}
		}
		return candidata;
	}
	
	public Civilta evolvi (int n) {
		int i = 0;
		
		while (i<n) {
			for (Civilta elem: arrayCivilta) {
				elem.faiProdurre();
				this.commercia();				
			}
			i++;
		}
		
		return this.piuRicca();
		
	}
	
	public void conquista () {
		Civilta cr = this.piuRicca();
		Civilta cp = this.piuPovera();
		
		if (cp.getCittaList().size() == 0) return;
		Citta cittaMin = cp.getCittaList().get(0);
		
		if (cp.getTesoro() != cr.getTesoro()) {
			int min = Integer.MAX_VALUE;
			
			for (Citta elem: cp.getCittaList()) {
				Risorsa risorsa = elem.produci();
				int prezzo = risorsa.getPrezzo();
				if (prezzo < min) {
					min = prezzo;
					cittaMin = elem;
				}
			}
				
		}
		cr.aggiungiCitta(cittaMin);
		cp.rimuoviCitta(cittaMin);

	}
}
