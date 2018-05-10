package com.trainingcore.java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingTelissco {
	
	public static void main(String[] args) throws IOException {
		
		File myfile = new File("teliscoTest.txt");
		
		FileOutputStream f = new FileOutputStream(myfile);
		DataOutputStream dos = new DataOutputStream(f);
		dos.writeUTF("WHAT IS OUR NAME:");
		dos.writeUTF("MY NAME IS LOVEBUD:");
		
		ReadFile.ReadThisFile();	
	}
}

class ReadFile {
	
	public static void ReadThisFile() throws IOException {
		
		FileInputStream fis = new FileInputStream("teliscotest.txt");
		DataInputStream dis = new DataInputStream(fis);
		String str = " ";
		str = dis.readUTF();
		System.out.println(str);
		/*while((str = dis.readUTF())!=null);
		
		System.out.print(str);*/
	}
}
