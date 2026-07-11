package com.k8s1;

import java.util.Scanner;

public class HackerRankChallange1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your number:");
		int n = sc.nextInt();

		if (n % 2 != 0) {
			System.out.println("Weird");
		} else {
			
			if (n >= 2 && n <= 20) {
				if (n <= 5) {
					System.out.println("Not Weird");
				} else {
					System.out.println("Weird");
				}
			} else {
				System.out.println("Not Weird");
			}
		}

	}
}
