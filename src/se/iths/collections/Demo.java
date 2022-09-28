package se.iths.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Text0");
        System.out.println(myList.size());

        myList.add("Text1");
        myList.add("Text2");
        myList.add("Text3");
        myList.add("Text3");

        myList.remove(2);

/*        //Väldigt DÅLIG metod att ta bort element med specifikt innehåll:
        myList.remove("Text3");
        for (int i = 0; i < myList.size(); i++) {
            String data = myList.get(i);
            if (data.equals("Text3")) {
                myList.remove(i);
                i--;
            }
        }*/

        //Väldigt BRA metod att ta bort element med specifikt innehåll:
        myList.removeIf(e -> e.equals("Text3"));

/*
        //Printa listan som skrivskyddad för att förhindra ändringar
        printList(Collections.unmodifiableList(myList));
*/

        //Skapa en lista som inte går att modifiera i efterhand
        List<String> compass = List.of("North", "East","South","West");
        printList(compass);

    }
    public static void printList(List<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}
