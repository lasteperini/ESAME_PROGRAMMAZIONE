import java.util.Scanner;

public class ScambiaVariabili {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Fornisci la prima variabile");
		
		int a = in.nextInt();
		
		System.out.println("Fornisci la seconda variabile");

		int b = in.nextInt();
		
		System.out.println("a vale: "+ a);
		System.out.println("b vale: "+ b);
		
		int c = b;
		b = a;
		a = c;
		System.out.println("a vale: "+ a);
		System.out.println("b vale: "+ b);
		
		
	}
	
}
