package com.zobra;

import java.util.Scanner;

public class Learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		String string;
		
		System.out.println("Enter the string value");
		string = scan.nextLine();
		
		System.out.println("Enter the first Number");
		firstNumber = scan.nextInt();
		
		System.out.println("Enter the second Number");
		secondNumber = scan.nextInt();
		
		System.out.println(+ firstNumber + string + secondNumber );
		
	}

}
