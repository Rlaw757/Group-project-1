package com.grouProject;

public class Task1 {

	public static void main(String[] args) {
		int [][] nums = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},	
		};
		int sum = 0;
		
		for (int [] num:nums) {
			for(int all:num) {
				sum+=all;
			}
			
			System.out.println(sum);
		}

	}

}
