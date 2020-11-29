package zadatak6;

public class Inversion {
	
	public static <E> E[] inverz(E[] array,int n, int k) {
		if((n == k) || (n < k)) {
			return array;
		} else {
			E temp = array[k];
			array[k] = array[n];
			array[n] = temp;
			return inverz(array, n-1, k+1);
		}
	}

}
