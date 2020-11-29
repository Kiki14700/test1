
package zadatak1;

public class Message {
	
	public static String msg(int n) {
		if (n == 0) {  // ovdje je jendakost postavljena n==0 kako bi se poruka ispisala ooliko koliko smmo puta željeli a ne jednom manje
			return "Ovo je poruka :-)";
		} else {
			System.out.println("Ovo je poruka :-)");
			return msg(n-1);
		}
	}
	
	

}
