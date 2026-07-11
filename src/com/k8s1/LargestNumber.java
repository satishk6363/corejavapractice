package com.k8s1;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		int number1,number2,number3;
		int largestnumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1:");
		number1 = sc.nextInt();
	
		System.out.println("enter number2:");
		number2 = sc.nextInt();
		
		System.out.println("enter number3:");
		number3 = sc.nextInt();
		if(number1>number2 && number1>number3) {
			largestnumber=number1;
		}
		else if(number2>number3) {
			largestnumber=number2;
		}
		else {
			largestnumber=number3;
		}
		System.out.println("largest number:"+ largestnumber);
		
	}
	

}
