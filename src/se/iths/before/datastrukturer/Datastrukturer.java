package se.iths.before.datastrukturer;

import java.util.ArrayList;
import java.util.HashMap;

public class Datastrukturer {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("List  contains the following: " + list.toString());
		list.add(5);
		list.add(18);
		list.add(-20);
		System.out.println("After add list contains: " + list.toString());
		list.add(2, -10);
		System.out.println("List size is: " + list.size());
		System.out.println("After adding -10 to index 2 the list contains: " + list.toString());
		list.remove(1);
		System.out.println("After removing the first element: " + list.toString());
		System.out.println("The element in index 2 is: " + list.get(2));
		list.clear();
		System.out.println("After clear list contains: " + list.toString());

		HashMap<String, String> phoneBook = new HashMap<String, String>();
		phoneBook.put("0703355530", "Julia");
		phoneBook.put("0706413413", "Billy");
		System.out.println("The phone book has the following entrings: " + phoneBook.toString());
		System.out.println("Number of entries in phone book: " + phoneBook.size());
		System.out.println(phoneBook.get("0703355530") + " has the phone number 0703355530");
		phoneBook.remove("0703355530");
		System.out.println("The phone book after removing Julia looks like this: " + phoneBook.toString());
		System.out.println("After removing a number: " + phoneBook.size());
		phoneBook.clear();
		System.out.println("After clear phoneBook contains: " + phoneBook.toString());
	}

}
