package zadatak7;

import java.util.Arrays;

public class Sort {
	

	public void sortiranje(int niz[], int n) { 					
	    
        for(int i = 0; i < n; i++) {							
            if ((niz[i] & 1) != 0)
            	niz[i] *= -1; 
        }
        Arrays.sort(niz); 
  
        for (int i = 0; i < n; i++) {							
            if ((niz[i] & 1) != 0) {
            	niz[i] *= -1;

	
            }
           }
        }			

	    

}
