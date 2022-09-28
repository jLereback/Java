package se.iths.before.refvaltypes;

public class RefValTypes {

	public static void main(String[] args) {
		
		/*Try to change int
		 * byte
		 * short
		 * int
		 * long
		 * float
		 * double
		 * char
		 * boolean
		 * Alla dessa �r value types
		 */
		int a = 10;
		intChanger(a);
		System.out.println(a);
		
		//Try to change array
		/* String
		 * Scanner
		 * ...
		 * Car
		 * Person
		 * Dog
		 * Player
		 * Alla dessa �r reference types
		 */
		int[] as = new int[] {3,15,90};
		arrayChanger(as);
		for (int i=0; i<as.length; i++) {
			System.out.println("as["+i+"] is "+as[i]);
		}
	}
	
	public static void intChanger(int x) {
		x = 25;
		System.out.println("x is " + x);
	}
	
	public static void arrayChanger(int[] xs) {
		xs[0] = 25;
		for (int i = 0; i<xs.length; i++) {
			System.out.println("xs[" + i + "] is " + xs[i]);
		}
	}

}
