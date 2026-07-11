package com.k8s1;

import java.util.Scanner;

public class OpearatorsUsingSwitchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first numer:");
		double number1 = sc.nextInt();
		System.out.println("Enter the target operation:");
		char operator = sc.next().charAt(0);
		System.out.println("Enter second numer:");
		double number2 = sc.nextInt();
		double result;
		switch(operator) {
		case '+':
			result = number1+number2;
			System.out.println(number1 + "+" + number2 + "=" + result);
			break;
		case '-':
			result = number1-number2;
			System.out.println(number1 + "-" + number2 + "=" + result);
			break;
		case '*':
			result = number1*number2;
			System.out.println(number1 + "*" + number2 + "=" + result);
			break;
		case '/':
			if(number2 == 0) {
				System.out.println("Error: invald divison by zero");
			}
			else {
				result = number1/number2;
				System.out.println(number1 + "/" + number2 + "=" + result);
				break;
			}
		default:
			System.out.println("Invalid operator");



		}
	}

}
