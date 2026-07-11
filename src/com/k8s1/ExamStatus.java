package com.k8s1;

import java.util.Scanner;

public class ExamStatus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your marks:");
		int StuMarks = sc.nextInt();
		if(StuMarks<35 && StuMarks==35) {
			System.out.println("You failed the exam");
		}
		if(StuMarks>35 && StuMarks<=70) {
			System.out.println("You passed the exam in Third class");
		}
		if(StuMarks>70 && StuMarks<=85) {
			System.out.println("You passed the exam in Second class");
		}
		if(StuMarks>=85) {
			System.out.println("You passed the exam in First class");
		}
		else {
			System.out.println("You passed the exam");
		}
	}

}
