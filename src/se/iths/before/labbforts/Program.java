package se.iths.before.labbforts;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Model m = new Model();
		
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to this simple cache memory!");
		System.out.println();
		System.out.println("To continue, do one of the following:");
		
		while(input != -2) {
			System.out.println();
			System.out.println("Add a positive number");
			System.out.println("Press -1 to clear");
			System.out.println("Press -2 to quit");
			input = sc.nextInt();
		
		//Avslutar programmet
		if(input == -2) {
			m.clearMemory();
			System.out.println("Memory cleared");
			System.out.println("Program quits");
			sc.close();
		}
		
		//Rensar minnet
		else if(input == -1) {
			m.clearMemory();
			System.out.println("Memory cleared");
		}
		
		//Positiv input
		else if(input > 0) {
			System.out.println("2^n = " + m.compute2Power(input));
		}
		
		//Negativ input
		else
			try {
			} catch(IllegalArgumentException e) {
				System.out.println("Negative number is invalid! Try again:");
			}
		}
	}
}