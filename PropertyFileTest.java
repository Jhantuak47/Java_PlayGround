package com.trainingcore.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFileTest {
	public static void main(String[] args)throws Exception {
		Properties ps = new Properties();
		
		File f = new File("testProperties.property");
		OutputStream os = new FileOutputStream(f);
	
		ps.setProperty("name", "jhantu");
		ps.setProperty("url", "localhost\\3679\\myDb");
		
		ps.store(os,null);
	}
}
