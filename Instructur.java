package com.trainingcore2.java;

public interface Instructur {
	
	void work();
	
	default void enjoy() {
		System.out.println("i ams work");
	}

}
