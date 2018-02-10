import java.util.Scanner;

public class MetodiStatici {

	public static void main(String[] args) {
	
		saluta();
		salutaConNome("Lavinia", 3);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nBase rettangolo:");
		double b = in.nextDouble();
		System.out.println("Altezza rettangolo:");
		double h = in.nextDouble();
		double a = areaRettangolo(b,h);
		System.out.println("\nArea:"+a);
		
		
		System.out.println("\nLato quadrato:");
		double l = in.nextDouble();		
		a= areaQuadrato(l);
		System.out.println("\nArea:"+a);
		
		
	
	}
	
	public static void saluta () {		
		System.out.println("\nBuongiorno!\n");	
	}
	
	public static void salutaConNome (String s, int n) {
		for (int i=0;i<n;i++) {		
			System.out.println("Buongiorno "+s+"!");
		}	
	}
	
	public static double areaRettangolo(double b, double h) {
		return b*h;
	}

	public static double areaQuadrato(double l) {
		return areaRettangolo(l,l);
	}

}
