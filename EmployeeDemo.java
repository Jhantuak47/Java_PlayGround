package com.trainingcore.java;

public class EmployeeDemo {
	public static void main (String[] args) throws Exception{
		//create object for joe
		Employee joe=new Employee("joe", 32);
		//create object for mike
		Employee mike=new Employee("mike",21);
		
		//
		joe.greet();
		mike.greet();
		//
		joe.work();
		mike.work();
	}

}
