public class PotenzeDiDue {
	
	public static void main(String[] args) {
		
		if (args.length ==0) {
			System.out.println("essun input");
			return ;
		}
		
		int counter = 0;
		
		for (int i=0; i< args.length; i++) {
			if (potenza(i)) {
				counter++;
			}
		}
				
		System.out.println(counter);
	}
	
	private static boolean potenza(int n) {
		
		int meta = n/2;
		
		if (n == 1) {
			return true;
		}

		if (n == 0) {
			return false;
		}
		
		if (n%2 ==0 && potenza(meta)) {
			return true;
		} else {			
			return false;
		}
			
	}
			
}
