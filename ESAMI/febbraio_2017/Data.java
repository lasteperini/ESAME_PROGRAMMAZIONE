import java.util.Calendar;

public class Data {
	private int giorno;
	private int mese;
	private int anno;

	/**costruisce una data con giorno (compreso fra 1 e 31), mese(compreso fra 1 e 12) e anno specificati
	*
	* @param g int giorno 
	* @param m int mese 
	* @param a int anno
	* @throws e IndexOutOfBoundsException
	*/
	
	public Data (int g, int m, int a) throws IndexOutOfBoundsException { 
		if (controllaData(g, m, a)) {
			this.giorno = g;
			this.mese = m;
			this.anno = a;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	/** costruisce la data corrente
	 * 
	 */
	 
	public Data () {
			
			this.giorno = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
			this.mese = Calendar.getInstance().get(Calendar.MONTH)+1;
			this.anno = Calendar.getInstance().get(Calendar.YEAR);
		
	}
	
	/** restituisce i giorni trascorsi dal 1/1/1970 alla data su cui è invocato.
	 * 
	 */
	public int giorniDaEpoca () {
		int sum = 0;
		for (int i = 1970;i< this.anno;i++) 
			sum += giorniAnno(i);
		
		for (int i = 1;i< this.mese;i++) 
			sum += giorniMese(i, this.anno);
		
		sum += this.giorno;
			
		return sum;
		
	}
	
	/** restituisce i giorni trascorsi dalla data d a quella su cui il metodo è
	 * invocato. Il valore restituito è negativo se la data su cui è invocato viene prima di d .
	 * 
	 * @param d Data
	 */

	public int giorniDa (Data altra) {
		return this.giorniDaEpoca()-altra.giorniDaEpoca();		
	}
	
	/** restituisce true se e solo se la data su cui è invocata viene prima della data d .
	 * 
	 * @param d Data
	 */
	 
	public boolean vienePrimaDi(Data d) {
		if (this.giorniDa(d) < 0) 
			return true;
		
		return false;
	}
	
	/** restituisce la data ottenuta come il giorno 1 del mese m+2 (dove m è il mese della data su cui è invocato)
	 * 
	 */
	public Data successiva () {
		int nuovoMese = this.mese+2;
		
		Data succ = new Data(1,nuovoMese,this.anno);
		
		return succ;
	}
	
	@Override
	public String toString () {
		StringBuilder sb = new StringBuilder();
		if (this.giorno/10 ==0) 
			sb.append("0");
		
		sb.append(this.giorno+"/");

		if (this.mese/10 ==0) 
			sb.append("0");
		
		sb.append(this.mese+"/");
		
		sb.append(this.anno);
		
		return sb.toString();		
		
	}
	
	private boolean controllaData (int g, int m, int a) {
		int max = 31;
		switch (m) {
			case 2: max = bisestile(a) ? 29 : 28;
			break;
			case 4: max = 30;
			break;
			case 6: max = 30;
			break;
			case 9: max = 30;
			break;
			case 11: max = 30;
		}
		if (g <= max) 
			return true;
			
		return false;
			
	}
	private boolean bisestile (int a) {
	
		if (a%4 == 0 && (a%100 != 0 || (a%100 == 0 && a%400 ==0))) 
			return true;
		
		return false;
	}
	
	
	private int giorniMese (int m, int a) {
		int max = 31;
		switch (m) {
			case 2: max = bisestile(a) ? 29 : 28;
			break;
			case 4: max = 30;
			break;
			case 6: max = 30;
			break;
			case 9: max = 30;
			break;
			case 11: max = 30;
		}
		return max;
						
	}
	
	private int giorniAnno (int a) {
		if (bisestile(a)) {
			return 366;
		} else {
			return 365;
		}
						
	}


}
