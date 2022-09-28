package se.iths.before.recursion;

import java.util.Scanner;


public class Recursion {
		//Recursion = sj�lvanrop (metod som anropar sig sj�lv)
		//Iteration = upprepning (en eller flera satser som uppretas)

	public static void main(String[] args) {
		int input;
		Scanner s = new Scanner(System.in);
		do {
		System.out.println("Enter a number (-1 to quit): ");
		input = s.nextInt();
		if(input == -1)
			continue;
		System.out.println(input + " factorial = " + factorial(input));
		} while(input != -1);
		s.close();
	}
	
	private static int factorial (int n) {
		 if((n == 1) || (n == 0)) {
			return 1;
		 }
		 else {
			 return n*factorial(n-1);
		 }
	}
}
