package se.iths.before.nulling;
/* Null = ingenting
	 * Ett v�rde variabler kan ha
	 * Variablerna �r d� "tomma"
	 * BARA p� reference types
	 * 		Reference types �r de som b�rjar p� STOR bokstav
	 */
import java.util.Scanner;

public class Nulling {

	public static void main(String[] args) {
		
		System.out.println("Get the length of input");
		String input = getUserInput();
		if (input != null) {
			System.out.println("length: " + input.length());
		 	char firstLetter = getFirstLetter(input);
		 	System.out.println("First letter: " + firstLetter);
		}
		else {
			System.out.println("length: 0");
		 	char firstLetter = getFirstLetter(input);
			System.out.println("First letter: " + firstLetter);
		}


	}
	
	public static char getFirstLetter(String input) {
		if (input != null) {
			return input.charAt(0);
		}
		else {
			return 0;
		}
	}

	
	
	public static String getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to give input?");
		String response = sc.nextLine();
		if (response.equals("no")) {
			return null;
		}
		else {
			return response;
		}
	}

}
