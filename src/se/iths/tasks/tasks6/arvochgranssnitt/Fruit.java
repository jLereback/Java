package se.iths.tasks.tasks6.arvochgranssnitt;

//Skriv minst fyra klasser som motsvarar olika djur
// Alla djur ska ha Animal som första superklass
// Andra superklasser som kan vara bra att ha med är
// Bird, Mammal, Fish osv
// Se till att de ärver från Animal och att klasserna för
// respektive djur ärver från rätt klass.

public class Fruit {

    public Fruit(int weight) {
        this.weight = weight;
        System.out.println(weight);
    }

    private final int weight;


    public void beEaten(String mouth) {

    }

    public Fruit getWeight() {
        System.out.println(weight);
        return null;
    }
}