package se.iths.before.gettersandsetters;

public class Main {
	public static void main(String[] args) {
		Position p = new Position();
//		p.setX(5);	//p.x = 5
//		p.setY(10); //p.y = 10;
		p.setPos(5, 10);
		
		System.out.println("(" + p.getX() + "," + p.getY() + ")");
	}
}
