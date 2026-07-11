package com.k8s2;

import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		
		ReverseNum obj = new ReverseNum();
		obj.revnum(n);
		
		}
	void revnum(int n) {
		int rev = 0;
		while(n!=0) {
			int LastDig = n%10;
			rev = rev * 10 + LastDig;
			n = n/10;	
		}
		
		System.out.println(rev);
		
	}
}
