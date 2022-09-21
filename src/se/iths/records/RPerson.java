package se.iths.records;

public record RPerson(String firstName, String lastName, int age) {

    public String getName(){
        return firstName + " " + lastName;
    }
}
