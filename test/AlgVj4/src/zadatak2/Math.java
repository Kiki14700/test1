package zadatak2;

public class Math {
	
	public static long withRec(int x, int n) {

		if(n == 0) {
			return 1;
		} else {
			return x * withRec(x,n-1);
		}
	}

	public static long pot(int x, int n) {
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
	
	


}
