package com.zobra;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = scan.nextInt();
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("* ");
				
				
			}
			System.out.println("   ");
		}
		
	}

}
 
// using switch case try to find out any character is vowel or consonant?
// example a vowel, x = consonent 
// using switch case try to find out the day of week
//example 2 - Tuesday
// to find out largest among three numbers
// display pattern
/* 
 
  * * * *
    * * *
      * *
        *   

find out the average of first natural 10 nautal numbes 
*/ 