//import java.util.StringBuilder;

public class VonNeumann {
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);

		System.out.println(vonneumann(n));

	}

	private static StringBuilder vonneumann(int n) {
	
		if (n == 0) {
			StringBuilder sbZero = new StringBuilder("{}");
			return sbZero;
		}

		StringBuilder sb = new StringBuilder( "{");
		for (int i=0;i<n-1;i++) {
			sb.append(vonneumann(i));	
			sb.append(",");
		}
		sb.append(vonneumann(n-1));
		sb.append("}");
		return sb;
	}
}
