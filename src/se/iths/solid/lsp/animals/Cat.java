package se.iths.solid.lsp.animals;

public class Cat extends Mammal implements Pet {

    @Override
    public void talk() {
        this.name = "Misse";
        System.out.println("Meow, meow!");
    }

    @Override
    public boolean isCute() {
        return true;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name= " + getName() +
                "}";
    }
}