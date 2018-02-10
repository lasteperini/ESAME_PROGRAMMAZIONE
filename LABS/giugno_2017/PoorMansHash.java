public class PoorMansHash {
	
	public static void main(String[] args) {
		
		if (args.length == 0) 
			return;
		String input = args[0];
		char[] output = new char[15];
		
		for (int i=0;i<15;i++) {
			output[i]=' ';
		}
		
		for (int i=0;i<input.length();i++) {
			//if (i<15) {
				int asciiVal = (int) input.codePointAt(i);
				int asciiValThird = asciiVal/3;
				int k = i%15;
				int kout = (int) output[k];
				output[k] = (char) (kout + asciiValThird); 
				kout = (int) output[k]; 
				output[k]  = (char) ((kout%95)+33);
			
			//}
		}
		System.out.println(String.valueOf(output));

	}
	
	
}



