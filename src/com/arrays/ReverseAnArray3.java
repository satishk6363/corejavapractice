package com.arrays;

import java.util.Scanner;

public class ReverseAnArray3 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an Array : ");
		
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		for(int i = 0; i<numbers.length; i++) {
			
			System.out.print("Enter elements " + (i+1) + " : ");
			
			numbers[i] = sc.nextInt();
		}
		
		ReverseAnArray2 reverse = new ReverseAnArray2();
		
		System.out.println("\nReversedArray:");
		
		  int[] revresedarray  = reverse.reverseArray(numbers);
		  
		  for(int i = 0; i<revresedarray.length; i++) {
			  
			  System.out.print(revresedarray[i] + " ");
			  
		  }
		  sc.close();
		
		
	}
	
	int[] reverseArray(int[] originalArray) {
		
		int i =0;
		
		while(i<originalArray.length/2) {
			
            int temp = originalArray[i];
			
            originalArray[i] = originalArray[originalArray.length-i-1];
			
            originalArray[originalArray.length-i-1] = temp;
			
			i++;
		}
		return originalArray;
	}

}
