package com.k8.looping;

public class Square_Hollow_Pattern {
	
	public static void printpattren(int n) {
		int i=0; int j=0;
		for(i=0;i<=n;i++) {
			if(i==0 || j==0 || i==n-1 && j==n-1) {
				System.out.println("*");
			}
			else {
				System.out.println("");
			}
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int n =6;
		System.out.println(n);
	}
}
	


