package zadatak2;

public class App2 {
	
	public static void main(String[] args) {
		
		System.out.println(Math.withRec(2, 15));
		long startTime = System.nanoTime();
		
		Math.withRec(2, 19);
		
		long stopTime = System.nanoTime();
		System.out.println("Time for recursion: " + (stopTime - startTime) + " milisec");
		
		System.out.println(Math.pot(2, 15));
		long strtTime = System.nanoTime();
		
		Math.pot(2, 19);
		
		long stpTime = System.nanoTime();
		System.out.println("Time for loop: " + (stpTime - strtTime) + " milisec");
		
		
		
	}

}
