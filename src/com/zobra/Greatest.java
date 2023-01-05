package com.zobra;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("enter a number1 ");
		num1 = scan.nextInt();
		
		System.out.println("enter a number2 ");
		num2 = scan.nextInt();
		
		System.out.println("enter a number3 ");
		num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			
			System.out.println("Greatest number among " + num1 + ", " + num2 + ", and " + num3 + " is " + num1 );
		}
		
		else if(num2 > num1 && num2 > num3) {
			
			System.out.println("Greatest number among " + num1 + ", " + num2 + ", and " + num3 + " is "  + num2 );
			
		}
		
		else {
			System.out.println("Greatest number among " + num1 + ", " + num2 + ", and " + num3 + " is "  + num3);
		}
		
		

	}

}
