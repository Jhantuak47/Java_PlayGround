package com.trainingcore.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFileHandling22 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
			
			
			try(BufferedReader br = new BufferedReader(new FileReader("E:\\recovery\\javaj\\oops\\class1.java"))) {
				
				String str =" ";
				while((str = br.readLine())!= null) {
					
					System.out.println(str);
					
				}
			}
	}
}
