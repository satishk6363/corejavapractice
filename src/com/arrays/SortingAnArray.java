package com.arrays;


import java.util.Scanner;
public class SortingAnArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an array :");
		
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.print("Enter element " + (i+1) + " : ");
			
			numbers[i] = sc.nextInt();
		}
		
		
		SortingAnArray sorted = new SortingAnArray();
		
		System.out.print("\nSortedArray: ");
		
		   int[] sortAnArray  = sorted.sortAnArray(numbers);
		   
		   for(int i=0; i<numbers.length; i++) {
			   
			   System.out.print(sortAnArray[i] + " ");
		   }
		   sc.close();
	}
	
	int[] sortAnArray(int[] array) {
		
		for(int i =0; i< array.length; i++ ) {
			
			for(int j =1; j<array.length; j++) {
				
				if(array[j-1]> array[j]) {
					
					int temp = array[j-1];
					
					array[j-1] = array[j];
					
					array[j] = temp;
					
					
				}
			}
		}
		return array;
	}

}
