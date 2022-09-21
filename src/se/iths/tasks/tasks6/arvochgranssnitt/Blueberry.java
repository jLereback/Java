package se.iths.tasks.tasks6.arvochgranssnitt;

public class Blueberry extends Berry {
    public Blueberry(int weight) {
        super(weight);
    }

    @Override
    public void beEaten(String mouth) {
        System.out.println("Blåbäret färdas i en sked till " + mouth);
    }
}
