package com.trainingcore2.java;

	public class DemoUserDefineException {
		
		public static void main(String[] args) {

			int x = 5;
			try{
				if(x<10) {
					throw new MyException("MY EXCEPTION");
				}
			}catch(Exception e) {
				
				System.out.println(e);
			}
		}		
	}

	class MyException extends Exception {
		 
		public MyException(String msg) {
			
			super(msg);
		}
	}