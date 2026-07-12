package com.arrays;

import java.util.Scanner;
public class ReverseAnArray1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of an Array : ");
		
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.print("Enter element " + (i + 1) + " : ");
			
			numbers[i] = sc.nextInt();
		}
		
		ReverseAnArray1 reverse = new ReverseAnArray1();
		
		  int[]  reversedArray = reverse.reverseArray(numbers);
		  
		  System.out.println("\nReversedArray : ");
		  
		  for(int i=0; i<reversedArray.length; i++) {
			  
			  System.out.print(reversedArray[i] + " ");
			  
		  }
		
		  sc.close();
	}
	
	int[] reverseArray(int[] originalArray) {
		
		int[] reverseArray = new int[originalArray.length];
		
		int j = 0; 
		
		for(int i = originalArray.length-1; i>=0; i--) {
			
			reverseArray[i] = originalArray[j];
			
			j++;
			
		}
		
		
		return reverseArray;
		
	}

}
