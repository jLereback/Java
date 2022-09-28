package se.iths.before.exceptions;

import java.util.ArrayList;
import java.util.Scanner;


public class Exceptions {


	public static void main(String[] args) {
		int upperBound = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		while(upperBound != -1) {
			System.out.println("Enter the upper bound (-1 to quit): ");
			upperBound = s.nextInt();
			if(upperBound == -1)
				continue;
			else {
				list.clear();
				try {
					fillList(0, upperBound, list);
				}catch(IllegalArgumentException e) {
					System.out.println("Invalid number! Try again");
					continue;	
				}
				System.out.println(list.toString());
			}
		}
		s.close();
	}
	
	private static ArrayList<Integer> fillList(Integer start, Integer finish, ArrayList<Integer> list){
		if(finish < 0)
			throw new IllegalArgumentException();

		list.add(start);
		if(start.equals(finish)) {
			return list;
		}
		else {
			return fillList(start + 1, finish, list);
		}
	}
}
