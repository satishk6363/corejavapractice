package com.k8s1;

import java.util.Scanner;

public class AbsoluteValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter absolutevalue");
		int AbsVal = sc.nextInt();
		if(AbsVal<0) {
			AbsVal = (-1)*AbsVal;
			System.out.println(AbsVal);	
		}
		else {
			System.out.println(AbsVal);
		}
			
			
		
	} 

}
