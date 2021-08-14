package com.grouProject;

public class task7 {

	public static void main(String[] args) {
		int[] num = { 34, 56, 34, 45, 56 };
		int largest = num[0];
		largest = num[0];
		for (int i : num) {
			if (i > largest) {
				largest = i;
			}
		}
		System.out.println(largest);
		int smallest= num[0];
		for(int r:num) {
			if(r<smallest) {
				smallest=r;
			}
		}
		System.out.println(smallest);
	}
}
			
		
		
		
		
	

         
         