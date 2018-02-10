import java.math.BigInteger;

public class S3ToInt {
	
	public static void main(String[] args) {
		
		String s = args[0] ;
		StringBuilder sb = new StringBuilder();	
				
		for (int i =0;i < s.length();i++) {
			char c = s.charAt(i);
			switch (c) {
				case 'z': sb.append("0");
					break;
				case 'u': sb.append("1");
					break;
				case 'd': sb.append("2");
					break;
				default: System.out.println("input non valido");
						return;
			}
		}
		String newS = sb.toString();
		Integer bg = Integer.parseInt( newS,3);
		System.out.println(bg);
		
	}
}
