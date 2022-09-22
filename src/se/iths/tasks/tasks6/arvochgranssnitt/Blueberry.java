package se.iths.tasks.tasks6.arvochgranssnitt;

public class Blueberry extends Berry {
    public Blueberry(int weight) {
        super(weight);
    }

    @Override
    public void beEaten(String mouth) {
        System.out.println("The blueberry goes toward the " + mouth + " in a spoon");
    }
}
