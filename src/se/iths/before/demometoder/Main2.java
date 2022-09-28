package se.iths.before.demometoder;

public class Main2 {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.setInformation("Julia", 23, "Support Tekniker");
		p.buyCar("Renault", 2019);
		
		Person p2 = new Person();
		
		p2.setInformation("Billy", 44, "M�ttekniker");
		p2.buyCar("Toyota", 2008);
		
		p.printPerosn();
		p2.printPerosn();
		
		p.tradeCar(p2);
		
		p.printPerosn();
		p2.printPerosn();
	}

}
