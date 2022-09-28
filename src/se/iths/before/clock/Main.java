package se.iths.before.clock;

public class Main {
	public static void main(String[] args) {

		Clock c = new Clock();
		c.setTime(0,0,0);

		while(true) {
			c.tick();
			c.printClock();
		}
	}
}
