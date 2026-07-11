package com.k8s1;

import java.util.Scanner;

public class EveOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number:");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
	}

}
