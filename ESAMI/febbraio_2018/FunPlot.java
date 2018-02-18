import java.math.*;

public class FunPlot {
	
	public static void main(String[] args) {
		
		if (args.length != 4) {
			System.out.println("Dati non validi");
			return;
		}
		
		try {
			double min = Double.parseDouble(args[0]);
			double max = Double.parseDouble(args[1]);
			double passo = Double.parseDouble(args[2]);
			String func = args[3];
			double minY = Double.MAX_VALUE;
			double maxY = Double.MIN_VALUE;
			
			
			double pos = min;
			
			
			while (pos < max) {
				double y = operation(func,pos);
				System.out.printf("%.1f",pos);
				//controllo if (y> -40 && y < 40 ) aggiunto post esame
				if (y> -40 && y < 40 ) {
					for (int i = -40 ; i < (int) y; i++) {
						System.out.printf(" ");
					}
				}
				
				System.out.printf("* : %.2f",y);
				pos = pos+ passo;
				System.out.print("\n");
			}
				
			
		
		} catch (NumberFormatException e) {
			System.out.println("Dati non validi");
			return;
		}
		
	
		
	
	}

	
	public static double operation(String func, double x) {
		if (func.equals("square")) {
			return x*x;
		}
		if (func.equals("3x2")) {
			return 3*x+2;
		}
		if (func.equals("pow4")) {
			return x*x*x*x;
		}
		if (func.equals("resto10")) {
			return x%10;
		}
		if (func.equals("tan")) {
			return Math.tan(x);
		}
		
		return 0.0;
		
	}
	
	


}


