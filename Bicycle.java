package com.trainingcore.java;

class Base {
}
public class Bicycle {
	private int cadence;
	private int gear;
	private int speed;
	
	public Bicycle(int cadence,int gear,int speed) {
		this.cadence=cadence;
		this.gear=gear;
		this.speed=speed;
	}
	//need some methods to get inside the variable ;

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

}
