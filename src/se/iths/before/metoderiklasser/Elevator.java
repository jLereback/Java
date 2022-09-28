package se.iths.before.metoderiklasser;

public class Elevator {
	public int floor;
	
	public void upAFloor() {
		floor++; 
	}
	
	public void downAFloor() {
		floor--;
	}
	
	public void setFloor(int f) {
		floor = f;
	}
	public boolean compareElevator(Elevator e) {
		return e.floor == floor;
	}
}
