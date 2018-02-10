public class StretteDiMano {

	public static void main(String[] args) {
	
		int persone = Integer.parseInt(args[0]);
		
		// regola:su 5
		// 1 le stringe a tutti (2-3-4-5)
		// 2 le stringe a 3 (3-4-5)
		// 3 le stringe a 2 (4-5)
		// 4 la stringe a 1 (5)
		
		int strette = stringi(persone);
		
		System.out.println(strette);
	
	
	}


	private static int stringi(int n) {
	
		if (n > 1) 
			return n-1+ stringi(n-1);
			//else
			return 0;
	}
}
