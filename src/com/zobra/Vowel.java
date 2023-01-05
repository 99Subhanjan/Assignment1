package com.zobra;

import java.util.Scanner;


public class Vowel {    // making a class called Vowel

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);  // is used for taking any input from user
		
		System.out.println("enter a string"); // asking user to input any string   
		
		String string = scan.nextLine();  // the value of string is stored in a string variable
		
		string = string.toLowerCase(); // converting the string into lower case
		
		System.out.println("the string in lower case is " + string ); // displaying the input string into lower case
		
		scan.close();
		
		int length;
		
		length = string.length(); // getting the length of string 
		
		System.out.println("length of string is  " + length); // displaying the length of string
		
		char[] chara = new char[length]; // breaking a string into character 
		
		for(int i = 0; i <= length; i++) { // making a loop to the length of string 
			
			chara[i] = string.charAt(i); // storing the value of character into chara
			
			switch (chara[i]) {   
			
			case 'a':
				System.out.println(Character.toString(chara[i]) + " is a vowel. "); //converting ASCII into character 
				break;
			
			case 'e':
				System.out.println( Character.toString(chara[i]) + " is a vowel. ");	
				break;
				
			case 'i':
				System.out.println(Character.toString(chara[i]) + " is a vowel. ");	
				break;
				
			case 'o':
				System.out.println(Character.toString(chara[i]) + " is a vowel. ");
				break;
				
			case 'u':
				System.out.println(Character.toString(chara[i]) + " is a vowel. ");
				break;
				
			default:
				System.out.println(Character.toString(chara[i]) + " is a consonant.");
				
				}
		}
		

	}

}
