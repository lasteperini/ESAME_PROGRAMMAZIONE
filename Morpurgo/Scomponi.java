import java.util.Scanner;

public class Scomponi {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero = in.nextInt();
		
		int migliaia = numero/1000;
		int centinaia = (numero%1000)/100;
		int decine = ((numero%1000)%100)/10;
		int unita = ((numero%1000)%100)%10;
		
		System.out.println(migliaia);
		System.out.println(centinaia);
		System.out.println(decine);
		System.out.println(unita);
		
		String s = in.next();
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		
		
	}
	
}
