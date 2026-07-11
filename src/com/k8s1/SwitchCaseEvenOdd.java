package com.k8s1;

import java.util.Scanner;

public class SwitchCaseEvenOdd {
	public static void main(String[] args) {
		int Evenodd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your number:");
		Evenodd = sc.nextInt();
		switch(Evenodd%2) {
		case 0:
			System.out.println("The number is even");
			break;
		case 1:
			System.out.println("The number is odd");
			break;
		default:
			System.out.println("Invald number");
		}




	}

}
