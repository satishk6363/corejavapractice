package com.k8s1;

import java.util.Scanner;

public class PosNegorZero {
	public static void main(String[] args) {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number:");
		num = sc.nextInt();
	
		if(num>0) {
			System.out.println("Number is positive");
		}
		else if(num<0) {
		System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is Zero");
			}
		
	}

}
