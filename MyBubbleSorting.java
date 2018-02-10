import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MyBubbleSorting {
	
	public static void main (String[] args)  throws  FileNotFoundException {
		int n = Integer.parseInt(args[0]);
		File file = new File("randomIntList.txt");
		Scanner in = new Scanner(file);
		Integer[] myArray = new Integer[n];
		int i = 0;
		
		while (in.hasNextLine() && i < n) {
			myArray[i] = in.nextInt();
			i++;
		}
		
		myArray = bbSort(myArray);
		
		//System.out.print("\n");
		for (int j = 0;j<n;j++) {
			System.out.print(myArray[j]+" ");
		}
		System.out.print("\n");
	}
	
	public static Integer[] bbSort(Integer[] a) {
		
		for (int j = 0;j < a.length-1; j++) {
			boolean flip = false;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i] > a[i+1]) {
					Integer temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					flip = true;
				}
			}
			if (!flip) {
				break;
			}
		}
		
		return a;
		
	}
	
}
