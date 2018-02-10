import java.util.Scanner;
import java.util.ArrayList;

public class RevRev {

		public static void main(String[] args) {
			ArrayList<String> righe = new ArrayList<String>();
			Scanner in = new Scanner(System.in);
			int contaRighe = 0;
			
			
			do {
				righe.add(in.nextLine());
			} while (in.hasNextLine());
			
			StringBuilder[] sb = new StringBuilder[righe.size()];
			int i = 0;
			for (String elem:righe) {
				String s = elem;
				StringBuilder val = new StringBuilder(s);
				sb[i] = val.reverse();
				i++;
			}
			for (int k = i-1; k >= 0; k--) {
				System.out.println(sb[k]);
			}
					
				
		}
}
