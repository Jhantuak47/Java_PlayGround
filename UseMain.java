package com.trainingcore2.java;

public class UseMain {
	
		public static void main(String[] args) {
			
			SimpleTimeService t1 =new SimpleTimeService(); 
			ITimeservice iobj =new SimpleTimeService();
			iobj.printime(10,10,10);
			iobj.printdate(12, 3, 2014);
			iobj.printdatetime(2,3, 6, 12, 3, 2014);
			//t1.printdatetime(2,3, 6, 12, 3, 2014);
		}
				
  }
