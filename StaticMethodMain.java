package com.trainingcore2.java;

public class StaticMethodMain {
	
	public static void main(String[] args) {
		
		IInterview obj1 = new managers();
		
		IInterview.sheduledMeeting(3);
		obj1.interview();
		System.out.println( IInterview.InterviewPerWeek);//since the inteface menber is public static final by default we can access it by this way...				
	}

}

 class managers implements IInterview {
	 	
	 public managers() {
		 System.out.println(InterviewPerWeek);
	 }

	@Override
	public void interview() {
	
		System.out.println("I am manager : Taking interview");		
	}
	
}

