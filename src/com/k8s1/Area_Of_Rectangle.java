package com.k8s1;

import java.util.Scanner;

public class Area_Of_Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length:");
		int a = sc.nextInt();
		System.out.println("Enter Breadth:");
		int b = sc.nextInt();
		int Area = a*b;
		System.out.println("Area of Rectangle:" + Area);

	}
}
