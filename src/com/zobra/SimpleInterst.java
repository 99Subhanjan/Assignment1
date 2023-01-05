package com.zobra;

import java.util.Scanner;

public class SimpleInterst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
	    double principal;
		double rate;
		double time;
		double interest;
		
		System.out.println("Enter the principal amount ");
		principal = scan.nextDouble();
		
		System.out.println("Enter the rate ");
		rate = scan.nextDouble();
		
		System.out.println("Enter the time ");
		time = scan.nextDouble();
		
		interest = principal * time * rate / 100;
		
		double finalAmount = principal + interest;
		scan.close();
		
		System.out.println("the interest ammount is " + finalAmount + ".");
		

		
	}

}
