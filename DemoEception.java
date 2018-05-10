package com.trainingcore2.java;

public class DemoEception {
	
		public static void main(String[] args) {
			
			int i,j,k,c;
			i=3;
			j=2;
			k=0;
			
			try {
				
				k=i/j;
				int a[]=new int[4];
				for(c=0;c<=4;c++) {
					
					a[c]=c++;
				}
				
			} catch (ArithmeticException e) {
				
				System.out.println("DIVIDED BY ZERO"+e);
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("array size is 4"+e);
			}
		}
}
