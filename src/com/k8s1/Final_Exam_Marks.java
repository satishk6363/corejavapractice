package com.k8s1;

import java.util.Scanner;

public class Final_Exam_Marks {
	int marks;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the marks");
	int marks=sc.nextInt();
	if(marks<35) {
		System.out.println("Student failed in the exam");
	}
	if(marks==35) {
		System.out.println("Student passed the exam");
	}
	if(marks<35 && marks<70) {
		System.out.println("Student passed in third class");
	}
if(marks>=70 &&marks<85) {
	System.out.println("Student passed in second class");
}
	
	else {
		System.out.println("Student passed in first class");
	}

}
}