public class ProvaLibreria {
	
		public static void main(String[] args) {
		
				Data data = new Data(1,1,2018);
				//Data dataOutOfBoundary = new Data(41,11,2018);
				
				Data oggi = new Data();
				
				System.out.println("data: "+data);
				System.out.println("oggi: "+oggi);
				
				System.out.println("oggi.giorniDaEpoca() ==> "+oggi.giorniDaEpoca());
				System.out.println("oggi.giorniDa(data) ==> "+oggi.giorniDa(data));
				System.out.println("oggi.successiva() ==> "+ oggi.successiva());
				
				Biblioteca vittuone = new Biblioteca("Vittuone");
				
				System.out.println("Biblioteca "+vittuone.toString()+" creata");
				
				for (int i = 0; i < 10000; i++) {
					String titolo = "Titolo"+i;
					String autore = "Autore"+i;
					
					Libro libro = new Libro(titolo,autore,true);
					
					vittuone.nuovoLibro(libro);
				}
				
				for (int i = 0; i < 500; i++) {
					String nome = "Pinco"+i;
					String cognome = "Pallino"+i;
					
					Utente utente = new Utente(nome,cognome,new Data());
					
					vittuone.nuovoUtente(utente);
				}
				
				for (int i = 0; i < 3; i++) {
					String titolo = "Titolo"+i;
					String autore = "Autore"+i;
					
					Libro libro = new Libro(titolo,autore,true);
					String nome = "Pinco"+i;
					String cognome = "Pallino"+i;
					
					Utente utente = new Utente(nome,cognome,new Data());
					
					int p = vittuone.quantiPrestiti(utente);
					System.out.println("L'utente "+utente.toString()+" ha "+ p +" libri");
					
					vittuone.daiInPrestito(libro,utente);
					
					System.out.println("Prestato libro "+libro.toString());
					
					int p2 = vittuone.quantiPrestiti(utente);
					System.out.println("L'utente "+utente.toString()+" ha "+ p2 +" libri");
				}
				
		}
	
}
