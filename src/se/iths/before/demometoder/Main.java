package se.iths.before.demometoder;

public class Main {

	public static void main(String[] args) {
	Person p = new Person();
	
	p.name = "Julia";
	p.age = 23;
	p.job = "Support Tekniker";
	
	Person p2 = new Person();
	
	p2.name = "Billy";
	p2.age = 44;
	p2.job = "M�ttekniker";
	
	p.friend = p2;
	
	Car c = new Car();
	c.year = 2019;
	c.brand = "Renault";
	
	p.car = c;
	
	Car c2 = new Car();
	c2.year = 2008;
	c2.brand = "Toyota";
	
	p2.car = c2;
	
	
	System.out.println(p.name + " heter jag");
	System.out.println(p.friend.name + " �r min v�n");
	System.out.println("Jag har en " + p.car.brand + " fr�n " + p.car.year);
	System.out.println(p2.name + " har en " + p2.car.brand + " fr�n " + p2.car.year);

	}

}
