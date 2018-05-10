package com.TestString.Demo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		char ch = 0;
		String str = new String();
		
		System.out.println("enter your string");
		str = new Scanner(System.in).nextLine();
		System.out.println("your string = "+str);
		System.out.println("Enter your character you want to replace:");
		ch =new Scanner(System.in).next().charAt(0);
		System.out.print("Modified String:"+new Test().removeChar(ch, str));
}
	private String removeChar(char a,String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
		if(a==s.charAt(i))
			continue;
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}


	
}
