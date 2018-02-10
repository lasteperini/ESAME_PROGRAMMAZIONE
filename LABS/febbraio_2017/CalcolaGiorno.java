
public class CalcolaGiorno {
	
	public static void main(String[] args) {
		String giorno = args[0];
		String mese = args[1];
		String anno = args[2];
		
		if (giorno.length() > 2 || mese.length() > 2 || anno.length() > 4) {
			System.out.println("errore");
			return;
		}
		
		
		
		try {
			int g = Integer.parseInt(giorno);
			int m = Integer.parseInt(mese);
			int a = Integer.parseInt(anno);
			int numerogiorni = 0;
	
			if (g > numeroGiorniDelMese(m,a) || m > 12) {
				System.out.println("errore");
				return;
			}
				
			
			for (int i = 1; i< m; i++) {
				numerogiorni += numeroGiorniDelMese(i,a);
			}
				
			//aggiungo i giorni del mese corrente
			
			numerogiorni = numerogiorni+g;
			
			System.out.println(numerogiorni);
		
		} catch (NumberFormatException e) {
			
			System.out.println("errore");
		}
			
		
	}
	
	public static boolean bisestile (int a) {
		if (a%4 == 0 && (a%100 != 0 || a%100 == 0 && a%400 == 0) ) {
			return true;
		} else {
			return false;
		}
			
	}
	
	public static int numeroGiorniDelMese (int m, int a) {
		int n;
		
		switch (m) {
			case 2:  if (bisestile(a))  n = 29; else n = 28;
			break;
			case 4: n = 30;
			break;
			case 6: n = 30;
			break;
			case 11: n = 30;
			break;
			default: n = 31;
		}
		
		return n;
	}
	
}
