package com.grouProject;

public class task3 {

	public static void main(String[] args) {
		int [][] nums = {
				{5,2,20},
				{4, 55, 30},
				{11, 8, 9},	
		};
		int sum = 0;
		int total=0;
		
		for(int [] numbs : nums) {
			for(int numb : numbs) {
				if (numb%2==0) {
					sum+=numb;
				}else if (numb%2!=0){
					total+=numb;
				}
				
				
			}
			
		}
		
	
	System.out.println("The sum of all even numbers in the array is "+sum);
	System.out.println("The sum of all odd numbers in the array is "+total);
		
	}
}


				
	


