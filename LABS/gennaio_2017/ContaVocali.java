import java.lang.System;
import java.util.Scanner;

public class ContaVocali {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String elenco,valore;
	int na=0,ne=0,no=0,ni=0,nu=0;
	int max=0,media=0,parole=0,vocali=0,vocaliParola=0;
	int i,j;
	while(in.hasNextLine() ){
		elenco = in.nextLine();
		String[] parts = elenco.split(" ");
		int length = parts.length;
		char lettera;
		parole = length;
		for (j=0;j<length;j++) {
			valore = parts[j];
			parole = parole++;
			for (i=0;i<valore.length();i++) {
				lettera = valore.charAt(i);
				if (lettera == 'a') {
					na++;
				}
				if (lettera =='e') {
					ne++;
				}
				if (lettera == 'o') {
					no++;
				}
				if (lettera == 'u') {
					nu++;
				}
				if (lettera == 'i') {
					ni++;
				}

			}
			vocaliParola = na+ne+no+ni+nu;
			if (vocaliParola > max) {
				max = vocaliParola;
			}
			vocali = vocali+vocaliParola;
			na=0;
			ne=0;
			ni=0;
			nu=0;
			no=0;
		}
	}	
	media = vocali/parole; 
	System.out.println("media:"+media);
	System.out.println("max:"+max);
	}
}
