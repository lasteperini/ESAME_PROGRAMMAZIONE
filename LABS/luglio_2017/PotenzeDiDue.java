

public class PotenzeDiDue {
	
	public static void main(String[] args) {
		
		int counter = 0;
		
		if (args.length == 0) {
			System.out.println("nessun input");
			return;
		}
		
		for (String elem : args) {
			int valore = Integer.parseInt(elem);
			int resto = 0;
			
			while ( valore >= 2 && resto == 0) {
				resto = valore%2;
				valore = valore/2;
			}
			
			if (resto == 0) {
				counter++;
			}
			
		}
		System.out.println(counter);
	}


}
