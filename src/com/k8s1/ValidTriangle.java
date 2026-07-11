package com.k8s1;

import java.util.Scanner;

public class ValidTriangle {
	public static void main(String[] args) {
		int angle1,angle2,angle3;
		int angle;
		int sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter angle1:");
		angle1 = sc.nextInt();
		System.out.println("Enter angle2:");
		angle2 = sc.nextInt();
		System.out.println("Enter angle3:");
		angle = sc.nextInt();
		if(angle%3==0) {
			System.out.println("triangle is valid");
	}
		else {
			System.out.println("triangle is invalid");
		}

}
}
