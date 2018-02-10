import java.util.Scanner;

public class StampaParola {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		String s;
		
		do {
			System.out.println("parola:");
			System.out.print("--> ");
			
			s = in.nextLine();
			
			if (s.length()!= 0) {
				if (s.length() == 1) {
					System.out.println("*");
				} else {
					String sub = s.substring(1,s.length()-1);
					System.out.print("*");
					System.out.print(sub.toUpperCase());
					System.out.println("*");
					String sub1,sub2;
					
					int lunghezza = s.length();
					int mezzalunghezza = lunghezza/2;
					if (lunghezza%2==0) {
						sub1 = s.substring(0,mezzalunghezza);
						sub2 = s.substring(mezzalunghezza);
					} else {
						sub1 = s.substring(0,mezzalunghezza+1);
						sub2 = s.substring(mezzalunghezza+1);
					}
						
					System.out.println(sub1.toUpperCase());
					System.out.println(sub2.toUpperCase());
					
						
				}
					
			}
		} while (s.length() != 0);
			
	
	
	}
}
