package com.k8s1;

import java.util.Scanner;

public class Even {
	
	public static boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		if(isEven(num))
		{
		System.out.println("Number is even");
		}
        else {
			System.out.println("Number is odd");
		}
		
       
	}

}
