package se.iths.before.mydogprogram;

public class MyDogProgram {

	public static void main(String[] args) {

		System.out.println("Hej");
		Dog d = new Dog();
		Dog d2 = new Dog();
		
		d.age = 15;
		d.name = "Lass";
		d.breed = "Border-Collie";
		
		d2.age = 1;
		d2.name = "Odie";
		d2.breed = "Border-Collie";
		d2.mother = d;
		
		System.out.println(d2.mother.name);
		
	}

}
