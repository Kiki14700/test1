package zadatak3;

import java.util.ArrayList;

import java.util.Iterator;

public class Math1 {
	
	public static long recPot(int x, int n) {

		if(n == 0) {
			return 1;
		} else {
			return x * recPot(x,n-1);
		}
	}

	public static long potLoop(int x, int n) {
		long res = 1;
		if(n != 0) {
			for(int k = 1; k <=n;k++) {
				res *=x;
			}
		} else {
			res = 1;
		}
		return res;

	}

	public static long powr(int x, int n) {
		long res;
		long interm;
		if (n == 0) {
			return 1;
		} else  {
			interm = powr(x,n/2);
			res = interm * interm;
			if (n%2 == 1) {
				res *=x;
			}

		}
		return res;
	}

	public static long elapsedRecuAlg_1(int x, int n) {
		long start = System.nanoTime();
		recPot(x, n);
		long stop = System.nanoTime();
		return (stop - start);
	}

	public static long elapsedLoop(int x, int n) {
		long start = System.nanoTime();
		potLoop(x, n);
		long stop = System.nanoTime();
		return (stop - start);
	}

	public static long elapsedRecuAlg_2(int x, int n) {
		long start = System.nanoTime();
		powr(x, n);
		long stop = System.nanoTime();
		return (stop - start);
	}

	public static void averageTimes(int x, int n, int reps) {
		ArrayList<Double> avgTimes = new ArrayList<>();
		ArrayList<Long> timsAl1 = new ArrayList<>();
		ArrayList<Long> timsAl2 = new ArrayList<>();
		ArrayList<Long> timsAl3 = new ArrayList<>();
		long timeElps1;
		long timeElps2;
		long timeElps3;
		for (int p = 0; p < reps; p++) {
			timeElps1 = elapsedRecuAlg_1(x, n);
			timsAl1.add(timeElps1);
			timeElps2 = elapsedRecuAlg_2(x, n);
			timsAl2.add(timeElps2);
			timeElps3 = elapsedLoop(x, n);
			timsAl3.add(timeElps3);
		}
		double avg1 = avgTims(timsAl1);
		double avg2 = avgTims(timsAl2);
		double avg3 = avgTims(timsAl3);
		avgTimes.add(avg1);
		avgTimes.add(avg2);
		avgTimes.add(avg3);
		listTimes(avgTimes);
	}


	private static double avgTims(ArrayList<Long> times) {
		Iterator<Long> iter = times.iterator();
		long sum = 0;
		double avg;
		while(iter.hasNext()) {
			sum = sum + iter.next();
		}
		avg = ((double)sum/times.size());
		return avg;
	}

	private static void listTimes(ArrayList<Double> avgTimes) {
		for(int k = 0; k < avgTimes.size(); k++) {
			System.out.println("Alg---> "+ (k+1)  + " : TIME : " + avgTimes.get(k));
		}
	}

}
