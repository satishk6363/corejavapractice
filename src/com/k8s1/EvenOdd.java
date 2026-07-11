package com.k8s1;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		 num = sc.nextInt();
		if(num%2 ==0) {
			System.out.println("even number");
			
		}
		else {
			System.out.println("odd number");
		}

	}



}
