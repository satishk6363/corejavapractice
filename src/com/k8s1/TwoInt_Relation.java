package com.k8s1;

import java.util.Scanner;

public class TwoInt_Relation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1:");
		int N1 = sc.nextInt();
		System.out.println("Enter Number2:");
		int N2 = sc.nextInt();
		if(N1<N2) {
			System.out.println("a<b");
		}
		else if(N1>N2) {
			System.out.println("a>b");
		}
		else {
			System.out.println("a==b");
		}
		
	}

}
