package com.trainingcore2.java;

public class Manager implements Employee,Instructur {

	@Override
	public void work() {
		System.out.println("working at manager class");
		
	}

	
	public void enjoy() {//therefore default method is only allowed in only at interfaces not in classes
		// TODO Auto-generated method stub
		System.out.println("inside overiden default method at manager");
		//Employee.super.enjoy();
		//Instructur.super.enjoy();
	}
		
}
