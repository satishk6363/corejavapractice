package com.k8s1;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		int marks1,marks2,marks3;
		double average;
		char grade;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks of subject1:");
		marks1 = sc.nextInt();

		System.out.println("Enter marks of subject2:");
		marks2 = sc.nextInt();

		System.out.println("Enter marks of subject3:");
		marks3 = sc.nextInt();

		average =(marks1=marks2=marks3)/3.0;


		if(average>=90) {
			grade = 'A';
		}
		else if(average>=80) {
			grade = 'B';
		}
		else if(average>=70) {
			grade = 'C';
		}
		else if(average>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("grade is:" + grade);
	}

}
