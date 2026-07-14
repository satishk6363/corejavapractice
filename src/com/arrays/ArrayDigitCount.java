package com.arrays;

public class ArrayDigitCount {
	
	public static void main(String[] args) {
		 
		int[] arr = {21, 323, 42, 5434};
		
		for(int i =0; i<arr.length; i++) {
			
			int number = arr[i];
			
			int count = 0;
			
			while(number>0) {
				
				number = number/10;
				
				count++;
			}
			
			System.out.println(arr[i] + " - " +  count);
		}
		
	}

}
