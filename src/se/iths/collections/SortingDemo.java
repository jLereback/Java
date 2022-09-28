package se.iths.collections;

import java.util.*;

public class SortingDemo {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("Zebra");
        stringList.add("Anakonda");
        stringList.add("Älg");
        stringList.add("Apa");

/*      Två olika sätt att sortera:
        stringList.sort(String::compareToIgnoreCase);
        Collections.sort(stringList);*/

        Collections.sort(stringList);

        for (String s: stringList) {
            System.out.println(s);
        }

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Halvar", 23));
        persons.add(new Person("Harald", 27));
        persons.add(new Person("Halvor", 22));
        persons.add(new Person("Hennie", 29));


        Collections.sort(persons);


/*
        //När man vill sortera utifrån de int som finns i listan
        Collections.sort(persons, (Comparator.comparing(o -> o.age)));
*/


        persons.forEach(System.out::println);
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}