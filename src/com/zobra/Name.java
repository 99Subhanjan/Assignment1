package com.zobra;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		
		// To generate the avearage of three numbers
		
		Scanner scan = new Scanner(System.in); 
		
		int num1, num2, num3;  // declaring the variables in integer
		
		double average; 
		
		
		System.out.println("enter three number ");
		
		num1 = scan.nextInt();
		
		num2 = scan.nextInt();

		num3 = scan.nextInt();
		
		average = (double) (num1 + num2 + num3) / 3 ; // converting the integer into double 
		
		System.out.println("the average of " + num1 + ", " + num2 + ", " 
		                    + num3 + " is " + average );
		

		
	}

}
