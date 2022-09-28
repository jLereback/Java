package se.iths.before.clock;

public class Clock {
	private int seconds;
	private int minutes;
	private int hours;
	
	public void tick() {
		setSeconds(seconds + 1);
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setSeconds(int s) {
		if(s <= 59 && s >= 0) {
			seconds = s;
		} else {
			seconds = s % 60;
			setMinutes(minutes + s/60);
		}
	}
	
	public void setMinutes(int m) {
		if(m <= 59 && m >= 0) {
			minutes = m;
		} else {
			minutes = m % 60;
			setHours(hours + m/60);
		}
	}
	
	public void setHours(int h) {
		if(h <= 23 && h >= 0) {
			hours = h;
		} else {
			hours = h % 24;
		}
	}
	
	public void setTime(int h, int m, int s) {
		setSeconds(s);
		setMinutes(m);
		setHours(h);
	}

	public void printClock() {
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}
