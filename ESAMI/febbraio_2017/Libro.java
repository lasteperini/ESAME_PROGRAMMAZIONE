import java.util.ArrayList;

public class Libro {
	private String titolo;
	private autori[];
	private int isbn;
	private boolean prestabile;
	
	
	public Libro (String titolo, String[] autori, boolean prestabile) {
		this.titolo = titolo;
		this.autori = new String[autori.length];
		for (int i = 0;i<autori.length;i++) {
			this.autori[i] = autori[i];
		}
		this.prestabile = prestabile;
		this.isbn = this.hashCode();
	}

	public Libro (String titolo, String autore, boolean prestabile) {
		this.titolo = titolo;
		this.autori = new String[1];
		this.autori[0] = autore;
		this.prestabile = prestabile;
		this.isbn = this.hashCode();
	}

	public Libro (String titolo, String[] autori) {
		this.titolo = titolo;
		this.autori = autori;
		this.prestabile = true;
		this.isbn = this.hashCode();
	}

	public Libro (String titolo, String autore) {
		this.titolo = titolo;
		this.autori[0] = autore;
		this.prestabile = true;
		this.isbn = this.hashCode();
	}
	
	@Override	
	public int hashCode () {
		int prime = 11;
		int h = this.titolo.hashCode();
		for (String elem : this.autori)
			if (elem != null)
				h += elem.hashCode();
		
		if (this.prestabile)
			h++;
		
		return -h*prime;
	}

	@Override	
	public boolean equals (Object obj) {
		if (obj instanceof Libro) {
			Libro altro = (Libro) obj;
			if (this.isbn == altro.isbn) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}

	@Override
	public String toString () {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[titolo: ");
		sb.append(this.titolo+",");
		sb.append("autori: ");
		
		for (String elem: this.autori) {
			if (elem != null)
				sb.append(elem+" ");
		}
		
		sb.append(", isbn: ");
		
		sb.append(this.isbn+"]");
		
		return sb.toString();		
		
	}
	
	public String getTitolo() {
		return this.titolo;
	}
	public boolean isPrestabile() {
		return this.prestabile;
	}
	
}
