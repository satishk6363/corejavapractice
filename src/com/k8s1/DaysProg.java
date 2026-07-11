package com.k8s1;

import java.util.Scanner;

public class DaysProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your day:");
		String day = sc.nextLine();
		switch(day) {
		case "monday":
		case "tuesday":
		case "wednsday":
		case "thursday":
		case "friday":
			System.out.println("Uff,it is a weekday");
			break;
		case "saturday":
		case "sunday":
			System.out.println("Uff,it is a weekend");
			break;
		}
	}

}
