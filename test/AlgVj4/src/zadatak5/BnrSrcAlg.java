package zadatak5;

public class BnrSrcAlg {
	
	public static int binarySearchAlg(int[] niz, int target) {
		
		int low = 0;
		int high = niz.length -1;
		
		while(low <= high) {
			int midIdx = (low + high)/2;
			
			if(niz[midIdx] == target) {
				return midIdx;
				
			}else if (niz[midIdx] > target) {
				high = midIdx-1;
				
			}else {
				low = midIdx + 1;
			}
		}
		
		return -1;
	

	}}