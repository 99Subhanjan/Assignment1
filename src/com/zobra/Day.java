package com.zobra;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter the number from 1 to 7 and I will tell the day based on the number"
				           + "for example if you enter 2, then the day will be Tuesday  ");
		int num = scan.nextInt();
		
		while (num >= 8 || num <= 0 ){
			
			System.out.println("enter the number between 1 to 7");
			num = scan.nextInt();
			}
		
		switch(num) {
		
		case 1:
			System.out.println(+ num + " is Sunday");
			break;
		
		case 2:
			System.out.println(+ num + " is Monday");
			break;
		
		case 3:
			System.out.println(+ num + " is Tuesday");
			break;
		
		case 4:
			System.out.println(+ num + " is Wednesday");
			break;
		
		case 5:
			System.out.println(+ num + " is Thursday");
			break;
		
		case 6:
			System.out.println(+ num + " is Friday");
			break;
		
		case 7:
			System.out.println(+ num + " is Saturday");
		
		
		}
			
			
		
		
			
			
		}
			
	}


