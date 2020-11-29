package zadatak7;

import java.util.Arrays;

public class App7 {
	
	public static void main(String[] args) {
		
		int[] niz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Sort srt = new Sort();   
        srt.sortiranje(niz, niz.length); 									
        System.out.println(Arrays.toString(niz));
	}
	
	

}
