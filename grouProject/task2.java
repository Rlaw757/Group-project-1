package com.grouProject;

public class task2 {

	public static void main(String[] args) {
		int [][] nums = {
				{12,23,31,34},
				{32,45,56},
				{64,67,78}
		};
		
		for (int [] number:nums) {
			for (int num:number) {
				if (num%2==0) {
					System.out.println(num);
				}
			}
		}

	}

}
