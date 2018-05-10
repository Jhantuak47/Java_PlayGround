package com.trainingcore2.java;

public interface Employee {
	
	void work();
	
	default void enjoy() {
		System.out.println("no work");
	}

}
