package com.trainingcore2.java;

public interface ITimeservice {
	
	public void printime(int hour,int minutes,int seconds);
	public void printdate(int day,int month,int year);
	default void printdatetime(int hour,int minutes,int seconds ,int day,int month,int year)
	{
		System.out.println("Time => "+hour+"-"+minutes+"-"+seconds+"\nDate => "+day+":"+month+":"+year);
	}
	
}
