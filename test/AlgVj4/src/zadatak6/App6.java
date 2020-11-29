package zadatak6;

import java.util.Arrays;

public class App6 {
	
	public static void main(String[] args) {
		
		Integer[] arr = {14, 7, 123, 134, 122, 100, 20, 19};
		String[] strs = {"ante", "mile", "pero", "josip", "ivica"};

		System.out.println("<------Integers------>");
		System.out.println("Before inversion:");
		System.out.println(Arrays.toString(arr));
		arr = Inversion.inverz(arr, arr.length-1, 0);
		System.out.println("After inversion:");
		System.out.println(Arrays.toString(arr));
		System.out.println("<------Strings------>");
		System.out.println("Before inversion:");
		System.out.println(Arrays.toString(strs));
		strs = Inversion.inverz(strs, strs.length-1, 0);
		System.out.println("After inversion:");
		System.out.println(Arrays.toString(strs));
	}

}
