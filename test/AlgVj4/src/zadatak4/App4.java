package zadatak4;

import java.util.Arrays;

public class App4 {
	
	public static void main(String[] args) {
		
		int [] niz = Array.stvNiz(14, 0, 100);
		int n = 7;
		System.out.println(Arrays.toString(niz));
		System.out.println("sum of first: " + n + " -> " + Array.zbrojN(niz, n));

	}

}
