import java.lang.System;

public class CostoAbbonamento {

	public static void main(String[] args) {

		double abbonamento = 0.0;

		if (args.length != 2) {
			System.out.println("Sintassi: [m/M]/[f/F] eta' (int)");
			return;
		}

		try {

			String primoElemento = args[0];

			if (primoElemento.length() != 1) {
				System.out.println("Sintassi: [m/M]/[f/F] eta' (int)");
				return;
			}

			char genere = primoElemento.charAt(0);
			int eta = Integer.valueOf(args[1]);

			if (genere != 'm' && genere != 'M' && genere != 'f' && genere != 'F' ) {
				System.out.println("Sintassi: [m/m]/[f/f] eta' (int)");
				return;
			}

		
			if (genere == 'm' || genere == 'M') {
				if (eta <= 10 || eta > 75 ) {
					abbonamento = 0.0;
				}
				if ((eta > 10 && eta <= 25) || (eta >= 65 && eta <= 75)) {
					abbonamento = 10.0;
				}	
				if (eta > 25 && eta <= 64 ) {
					abbonamento = 18.50;
				}			
			}
			if (genere == 'f' || genere == 'F') {
				if (eta <= 14 || eta > 75 ) {
					abbonamento = 0.0;
				}
				if ((eta > 15 && eta <= 30) || (eta >=65 && eta <= 75)) {
					abbonamento = 10.0;
				}	
				if (eta >= 31 && eta <= 64 ) {
					abbonamento = 18.50;
				}			
			}
			
			//if (abbonamento.wasNull()) {
			//	system.out.println("sintassi: [m/m]/[f/f] eta' (int)");
			//	return;
			//}

			
			if (abbonamento == 0.0) {
				System.out.println("Per te l'abbonamento e' gratis");
			} else {
				System.out.println("Costo abbonamento: " + abbonamento + " euro");
			}
		} catch (Exception e) {
		
			System.out.println("Sintassi: [m/M]/[f/F] eta' (int)");
			return;

		}
		


	}

}

