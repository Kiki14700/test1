package zadatak4;

import java.util.concurrent.ThreadLocalRandom;

public class Array {
	
	public static int[] stvNiz(int sz, int min, int max) {

		int[] niz = new int[sz];
		int cnt = 0;
		while(cnt < sz) {
			niz[cnt] = ThreadLocalRandom.current().nextInt(min, max);
			cnt++;
		}

		return niz;
	}
	public static long zbrojN(int[] niz, int n) {
		
		if (n == 0) {
			return 0;
		} else {
			return zbrojN(niz, n-1) + niz[n-1];
		}
	}

}
