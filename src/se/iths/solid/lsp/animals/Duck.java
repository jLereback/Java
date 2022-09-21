package se.iths.solid.lsp.animals;

public class Duck extends Mammal{
    @Override
    public void talk() {
        System.out.println("Quack, quack!");
    }
}