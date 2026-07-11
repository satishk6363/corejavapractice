package com.k8s2;

import java.util.Scanner;
public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks = sc.nextInt();
		String res = (marks<=35) ? "Failed"
	              : (marks >= 90) ? "Grade A"
	              : (marks >= 80) ? "Grade B"
	              : (marks >= 70) ? "Grade C"
	              : (marks >= 60) ? "Grade D"
	              : "Grade E";
		System.out.println("Your grade is : " + res);
	}
	

}
