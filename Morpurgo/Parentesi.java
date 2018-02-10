public class Parentesi {
	
	public static void main(String[] args) {
		
		//String corretta = "(a(b)c(d)e)";
		String errata = "(a((b)c(d)e)";
		
		//boolean ok = parentesiBenFormata(corretta,'(',')');
		
		//if (ok) {
		//	System.out.println(corretta+ " e' corretta");
		//} else {
		//	System.out.println(corretta+ " e' errata");
		//}
	
	
		boolean ok = parentesiBenFormata(errata,'(',')');
		
		if (ok) {
			System.out.println(errata+ " e' corretta");
		} else {
			System.out.println(errata+ " e' errata");
		}
	}
	
	private static boolean parentesiBenFormata(String testo,char parentesiAperta, char parentesiChiusa) {
		boolean result = false;
		StringBuilder testobs = new StringBuilder(testo);
		String parC = ""+ parentesiChiusa +"";
		
		System.out.println("Analizzo "+testo);
		
		if (testo.indexOf(parentesiAperta) == -1 && testobs.lastIndexOf(parC) == -1) {
			return true;
		}
		
		if (testo.indexOf(parentesiAperta) == -1 && testobs.lastIndexOf(parC) != -1) {
			return false;
		}	
		
		if (testo.indexOf(parentesiAperta) != -1 && testobs.lastIndexOf(parC) == -1) {
			return false;
		}	
		
		System.out.println("charInit "+testo.indexOf(parentesiAperta)+ " charEnd "+testobs.lastIndexOf(parC));
		
		if (testo.indexOf(parentesiAperta)+1 < testobs.lastIndexOf(parC))  {
			result = parentesiBenFormata(testo.substring(testo.indexOf(parentesiAperta)+1,testobs.lastIndexOf(parC)),parentesiAperta,parentesiChiusa);
		} else {
			result = parentesiBenFormata(testobs.substring(testo.indexOf(parC)+1,testo.lastIndexOf(parentesiAperta)),parentesiAperta,parentesiChiusa);
		}
		
		return result;
			
				
		
	}
	
}
