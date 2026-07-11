package com.k8.looping;

import java.util.Scanner;

public class Factorialnumber {


public static void main(String[] args) {
	int fact =1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int number = sc.nextInt();
	if(number<0) {
		System.out.println("Invald");
	}
	else {
		for (int i = 1; i <= number; i++) {
			fact = fact*i;
		}
		System.out.println("factiorl of number is:"+ fact );

	}
}
}






