package com.grouProject;

public class task5 {

	public static void main(String[] args) {
		int bot =25;
		boolean prime =true;
		
		for(int i =2; i<bot; i++) {
			
			if (bot%i==0) {
				prime=false;
				break;
			}
		}
		
		if (prime) {
			System.out.println( bot + "is a prime number");
		}
		else {
			System.out.println("not  a prime number ");
		}

	}

}
