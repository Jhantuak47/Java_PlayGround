package com.TestString.Demo;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		
		//Remove any given character from any given String...?
		System.out.println("enter your character..");
		char ch =new Scanner(System.in).next().charAt(0) ;
		System.out.println(new StringManipulation().removeCharacter("my name is jhantu", ch));
		
		//print all permutation of string both iterative and recursive way?
	}
	protected String removeCharacter(String str,char a) {
		
		StringBuilder stringbuilder = new StringBuilder();
		for(int i = 0;i<str.length();i++)
		{
			if(a==str.charAt(i))
				continue;
			stringbuilder.append(str.charAt(i));
		}
		return stringbuilder.toString();
	}
}
