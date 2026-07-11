package com.k8s1;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How are you");
		String status = sc.nextLine();
		System.out.println("what is your age?");
		int age = sc.nextInt();
		System.out.println("Thankyou for the information");
		sc.close();
	}

}
