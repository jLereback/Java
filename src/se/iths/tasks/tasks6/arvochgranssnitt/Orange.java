package se.iths.tasks.tasks6.arvochgranssnitt;

public class Orange extends Citrus {
    public Orange(int weight) {
        super(weight);
    }

    @Override
    public void beEaten(String mouth) {
        System.out.println("Apelsinen färdas med en gaffel till " + mouth);
    }
}
