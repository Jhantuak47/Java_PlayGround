package com.trainingcore.java;

public class Driver {
	public static void main(String[] args) {
		
		Bicycle B1=new Bicycle(32,50,10);
		System.out.println("value of cadence:"+B1.getCadence());
		System.out.println("value of speed:"+B1.getSpeed());
	}
}
