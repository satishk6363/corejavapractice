package com.arrays;

import java.util.Scanner;
public class ReverseAnArray2 {
	
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
	
	int[] reverseArray(int[] originalarray) {
		
		//int[] reversedArray = new int[originalarray.length];
		
		for(int i = 0; i<originalarray.length/2; i++) {
			
			int temp = originalarray[i];
			
			originalarray[i] = originalarray[originalarray.length-i-1];
			
			originalarray[originalarray.length-i-1] = temp;
			
			
		}
		return originalarray;
	}

}
