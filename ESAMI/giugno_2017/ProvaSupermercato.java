import java.util.ArrayList;
public class ProvaSupermercato {
	
	public static void main (String[] args) {
	
		Reparto repartoBevande = new Reparto("Bevande", "Giovanni Verdini");
	    UnitaDiMisura kg = new UnitaDiMisura("chilogrammo", "kg");
	    UnitaDiMisura g = new UnitaDiMisura("grammo", "g", kg, 1000);
	    UnitaDiMisura hg = new UnitaDiMisura("etto", "hg", kg, 10);
	    UnitaDiMisura l = new UnitaDiMisura("litro", "l");
	    UnitaDiMisura ml = new UnitaDiMisura("millilitri", "ml", l, 1000);
	    UnitaDiMisura num = new UnitaDiMisura("numero", "n");
	    UnitaDiMisura dozzina = new UnitaDiMisura("dozzina", "dozz", num, 1.0/12);
	    UnitaDiMisura rifKg = kg.riferimento();
	    UnitaDiMisura rifG = g.riferimento();
	    
	    
	    System.out.println(repartoBevande);
	    System.out.println(g);
	    System.out.println(kg);
	    compara(kg,g);
	    compara(kg,kg);
	    System.out.println(rifKg);
	    System.out.println(rifG);

		Prodotto birraMoretti = new Prodotto("Birra Moretti classica", repartoBevande, "37712341234AF3", 660, 1.25, ml);
		System.out.println(birraMoretti.prezzoUnitario());
		Offerta offBirraMoretti = new Offerta("PiùBirraPerTutti", birraMoretti, 25, 3, true);
		System.out.println(offBirraMoretti);
		
		System.out.println(offBirraMoretti.prezzo(5, false));
		System.out.println(offBirraMoretti.prezzo(2, true));
		System.out.println(offBirraMoretti.prezzo(3, true))	;
	}
	
	public static void compara (Object obj1, Object obj2) {
	    if (obj1.equals(obj2)) {
			 System.out.println(obj1.toString()+" e "+obj2.toString()+" sono uguali");
		} else {
			System.out.println(obj1.toString()+" e "+obj2.toString()+" sono diversi");
		}
		
		
	}
	
}
