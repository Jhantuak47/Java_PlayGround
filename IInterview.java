package com.trainingcore2.java;

public interface IInterview {
	
	int InterviewPerWeek=2;
	
	void interview();
	
	static void sheduledMeeting(int hour) {
		
		System.out.println("Booked room for "+hour+"hr");
		
	}
}
