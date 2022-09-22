package se.iths.tasks.tasks6.arvochgranssnitt;

public class Orange extends Citrus {
    public Orange(int weight) {
        super(weight);
    }

    @Override
    public void beEaten(String mouth) {
        System.out.println("The orange is going toward the " + mouth + " at a fork");
    }
}
