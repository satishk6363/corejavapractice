package com.k8s2;

import java.util.Scanner;
public class Pyrimid {
	public static void main(String[] args) {
		//int n = 5; //rows
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i; j<n; j++) {
				System.out.print(" "); //spaces
			} 
				for(int k=1; k<=(2*i-1); k++) {
					System.out.print("*");
				}
				System.out.println();
					
		}
	}

}
