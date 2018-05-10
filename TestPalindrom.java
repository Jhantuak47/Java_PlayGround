package com.TestString.Demo;

import java.util.Scanner;

public class TestPalindrom {
	
	public static void main(String[] args) {
		
		String arg = new String();
		String reverse = null;
		Scanner sc = new Scanner(System.in);
		

		System.out.println("enter your string:");
		arg = sc.nextLine();
		reverse =arg;
		
		//new TestPalindrom().palindromUsingBufferClass(arg);
		arg = new TestPalindrom().palindromSimple(arg);
		if(arg.equals(reverse))
			System.out.println("String is palindrom");
		else
			System.out.println("String is not palindrom");
	}
	protected void palindromUsingBufferClass(String arg) {
		
		StringBuffer str = new StringBuffer(arg);
		str.reverse();
		System.out.println("arg = "+arg+" str = "+str);
		if(arg.equals(str.toString()))
			System.out.println("string is palindrom");
		else
		System.out.println("Not palindrom");
	}
	protected String palindromSimple(String arg) {
		
		char[] characterString = arg.toCharArray();
		int i =0,j=arg.length()-1;
		while(i<j) {
			
			char temp = characterString[i];
			characterString[i]=characterString[j];
			characterString[j]=temp;
			i++;j--;
			
		}
		return new String(characterString);
	}
 }
