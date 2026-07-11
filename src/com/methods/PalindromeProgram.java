package com.methods;

import java.util.Scanner;
public class PalindromeProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		Palindrome(n);
	}
	static void Palindrome(int n) {
		int cp = n;
		int rev = 0;
		int Lastdig;
		while(n!=0) {
			
			Lastdig = n%10;
			rev = rev * 10 + Lastdig;
			n = n/10;
			
		}if(cp==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
