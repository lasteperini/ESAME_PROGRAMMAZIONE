import java.lang.StringBuilder;
 

public class Istogramma extends ModelloLinguistico {
	private int lMax = 0;
	
	// crea un istogramma in cui ogni riga ha la larghezza indicata (come
	// numero di caratteri); notate che i primi due caratteri di ogni riga sono costituiti dal carattere ('a', 'b', 'c',
	// ecc.) e da un TAB. I restanti larg-2 al massimo sono asterischi.
	
	public Istogramma(int larg) {
		this.lMax = larg;		
	}
	
	// crea una stringa che rappresenta il modello
	// linguistico m . Tale stringa è costituita da 26 righe (ognuna terminata con un a-capo), una per ogni
	// carattere. La riga della lettera a è data da un numero di asterischi proporzionale alla frequenza
	// relativa di a .
	// proporzione l=frequenzaRelativa*lMax
	public String toString(ModelloLinguistico m) {
		StringBuilder str = new StringBuilder();
		
		for(char c='a';c <= 'z';c++) {
			str.append(c+"\t");
			int largModello = (int) ((double) this.lMax* m.frequenzaRelativa(c));
			for(int i=0;i< largModello;i++) {
				str.append("*");
			}
			str.append(" | "+m.frequenzaRelativa(c)*100+"%\n");
		}	
		
		return str.toString();
	}
	
	
}
