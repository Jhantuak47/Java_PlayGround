package com.trainingcore2.java;

public class SimpleTimeService implements ITimeservice {

	@Override
	public void printime(int hour, int minutes, int seconds) {
			
		System.out.println("Time => "+hour+":"+minutes+":"+seconds);
	}

	@Override
	public void printdate(int day, int month, int year) {
		System.out.println("Date => "+day+":"+month+":"+year);
		
	}
	
}
