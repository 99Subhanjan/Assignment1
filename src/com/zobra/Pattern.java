package com.zobra;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 4; i++) {
			
			for(int j = 4; j >= i; j--) {
				
				System.out.print(" * "  );
			}
			
			System.out.println(" ");
			
			if(i == 1) {
				
				System.out.print("   ");
			}
			
			else if(i == 2) {
				System.out.print("      ");
			}
			
			else {
				System.out.print("         ");
			}
			
		}

	}

}
