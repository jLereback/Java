package se.iths.before.metoderiklasser;

public class Main {

	public static void main(String[] args) {
		Elevator e1 = new Elevator();
		e1.setFloor(5);
		
		Elevator e2 = new Elevator();
		e2.setFloor(10);
		
		e1.upAFloor();
		
		e2.downAFloor();
		e2.downAFloor();
		e2.downAFloor();
		e2.downAFloor();
		
		boolean b = e1.compareElevator(e2);
		
		System.out.println("F�rsta hissen st�r p� v�ning " + e1.floor);
		System.out.println("Andra hissen st�r p� v�ning " + e2.floor);
		System.out.println("�r hissarna p� samma v�ning? " + b);
	}

}
