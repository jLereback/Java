package se.iths.records;

import se.iths.records.Person;
import se.iths.records.RPerson;

public class RecordsDemo {

    public static void main(String[] args) {
        Person donald = new Person("Donald","Duck",88);

        System.out.println(donald);
        System.out.println(donald.getFirstName());

        RPerson donaldAsRecord = new RPerson("Donald","Duck",88);
        System.out.println(donaldAsRecord);
        System.out.println(donaldAsRecord.firstName());

        printPersonPretty(donaldAsRecord);
    }

    public static void printPersonPretty(RPerson person) {
        System.out.println(person.getName());
        System.out.println("-------------");
    }
}
