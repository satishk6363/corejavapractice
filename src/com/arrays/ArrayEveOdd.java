package com.arrays;

import java.util.Scanner;
public class ArrayEveOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		
		int size = sc.nextInt();
		
		int[] numbers = new int[size]; 
		
		for(int i =0; i<numbers.length; i++) {
			
			System.out.print("Enter element " + (i+1) + " : ");
			
			numbers[i] = sc.nextInt();
			
		}
		
		ArrayEveOdd arrEvenOdd = new ArrayEveOdd();
		
		System.out.println("\nEvenAndOdd:");
		
		int[] arr  =  arrEvenOdd.arrayEveOdd(numbers);
		
	}
	
	int[] arrayEveOdd(int[] arr) {
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(i%2==0) {
				
				evenCount++;
				
			}else {
				
				oddCount++;
			}
			
		}
		System.out.println("Even = " + evenCount);
		System.out.println("Odd = " + oddCount);
		
		return arr;
	}

}
