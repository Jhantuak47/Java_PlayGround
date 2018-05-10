package com.trainingcore.java;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
 public class DemoFileHandling {
	 
	 public static void main(String[] args) {
		
		 File myfile = new File("fileName1.txt");
			 
			 try {
				 if(!myfile.exists()){
				 
				 myfile.createNewFile();
				 }
				 //Writing inside the file
				 PrintWriter pw = new PrintWriter(myfile);
				 pw.println("this is my file content");
				 pw.println(1000);
				 
				 for(int i=0;i<=4;i++) {
					pw.println("THIS IS LINE NO."+i); 
				 }
				 pw.close();
				 System.out.println("file is created");
			  }
			 catch(IOException io) {
				 System.out.println("file is not created");
			 }
			 
		}
	}
