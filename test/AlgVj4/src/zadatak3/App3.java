package zadatak3;

public class App3 {
	
	public static void main(String[] args) {
		
		
			int x = 2;
			int n = 14;
			int reps = 1000000;

			System.out.println(Math1.recPot(x, n));
			System.out.println(Math1.powr(x, n));
			System.out.println(Math1.potLoop(x, n));

			System.out.println("<------ Average Times ------>");
			Math1.averageTimes(x,n,reps);

	}

}
