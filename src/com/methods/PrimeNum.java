package com.methods;

import java.util.Scanner;
public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		primenum(n);
	}
	static void primenum (int n) {
	int count = 0;
	for(int i=1; i<=n; i++) {
		if(n%i==0) {
			count++;
		}	
	}
	if(count==2) {
		System.out.println("prime number");
	}
	else {
		System.out.println("Not a prime number");
	}

}
}
