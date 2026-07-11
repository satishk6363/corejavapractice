package com.methods;

import java.util.Scanner;
public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int n = sc.nextInt();
		
		countdigit(n);		
	}
	static void countdigit(int n ) {
		int count = 0;
		while(n!=0) {
			count++;
			n = n/10;
				
		}
		System.out.println("Count of a number is : " + count);
	}

}
