package se.iths.solid.lsp.animals;

public class Dog extends Mammal implements Pet{
    @Override
    public void talk() {
        System.out.println("Woff, woff!");
    }

    @Override
    public boolean isCute() {
/*        if (getName() != null && getName().equals("Chihuahua"))
            return false;*/
        if ("Chuhuahua".equals(getName()))
            return false;
        return true;
    }
}