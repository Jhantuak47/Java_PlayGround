package com.trainingcore.java;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class DemoFileHandling2 {
	
	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try{
			 br = new BufferedReader(new FileReader("E:\\recovery\\javaj\\oops\\class1.java"));
			String line;
			 
			while((line=br.readLine())!=null) {
				
				System.out.println(line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			
			try{
			br.close();
		 }
			catch(IOException e) {
				e.printStackTrace();
			}
	   }
	}
}
