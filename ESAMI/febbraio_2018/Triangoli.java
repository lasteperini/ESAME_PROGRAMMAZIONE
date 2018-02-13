import java.util.Arrays;

public class Triangoli {

	public static void main(String[] args) {
	
		if (args.length != 6) {
			System.out.println("Dati non validi");
			return;
		}
		
		
		try {
			int[] triangolo1 = new int[3];
			int[] triangolo2 = new int[3];
			boolean compare = true;
			
			for (int i = 0;i<3;i++) {
				triangolo1[i] = Integer.parseInt(args[i]);
			}
			for (int i = 3;i<6;i++) {
				triangolo2[i-3] = Integer.parseInt(args[i]);
			}
			
			if (isTriangolo(triangolo1[0],triangolo1[1],triangolo1[2])) {
				System.out.println(Arrays.toString(triangolo1)+" è un triangolo");
			} else {
				System.out.println(Arrays.toString(triangolo1)+" non è un triangolo");
				compare = false;
			}
				
			if (isTriangolo(triangolo2[0],triangolo2[1],triangolo2[2])) {
				System.out.println(Arrays.toString(triangolo2)+" è un triangolo");
			} else {
				System.out.println(Arrays.toString(triangolo2)+" non è un triangolo");
				compare = false;
			}
				
			if (compare){ 
				if (areEquals(triangolo1,triangolo2)) {
					System.out.println("Sono uguali");
				} else {
					System.out.println("Non sono uguali");
				}
			}				
		
		
		} catch (NumberFormatException e) {
			System.out.println("Dati non validi");
		}
			
	}
	
	public static boolean isTriangolo(int a, int b, int c) {
		
		if (a<b+c && b<a+c && c< a+b) 
			return true;
		
		return false;
		
	}
	
	public static boolean areEquals(int[] triangolo1, int[] triangolo2) {
		
		Arrays.sort(triangolo1);
		Arrays.sort(triangolo2);
		
		
		for (int i = 0; i < 3; i++) 
			if (triangolo1[i] != triangolo2[i])
				return false;
		
		return true;
		
		
	}

}
