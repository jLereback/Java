package se.iths.before.demometoder;

public class Person {
	public String name;
	public int age;
	public String job;
	public Person friend;
	public Car car;
	
	public void setInformation(String n, int a, String j) {
		name = n;
		age = a;
		job = j;
	}
	
	public void printPerosn() {
		System.out.println("Jag heter " + name);
		System.out.println("Jag �r " + age + " �r gammal");
		System.out.println("Jag jobbar som " + job);
		System.out.println("Jag har en " + car.brand + " fr�n " + car.year);
	}
	
	public void buyCar(String brand, int year) {
		car = new Car();
		car.brand = brand;
		car.year = year;
	}
	
	public void tradeCar(Person p) {
		Car temp;
		temp = p.car;
		p.car = car;
		car = temp;
	}
}
