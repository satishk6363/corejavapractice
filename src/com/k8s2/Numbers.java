package com.k8s2;

import java.util.Scanner;
public class Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter count :");
		int n = sc.nextInt();
		for(int i = n ;i>=1; i--) {
			System.out.println(i);
		}
		
		
	}

}
