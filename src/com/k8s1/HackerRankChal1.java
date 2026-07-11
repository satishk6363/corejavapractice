package com.k8s1;

import java.util.Scanner;

public class HackerRankChal1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    //System.out.println("Enter an integer:");
	    int integer = scanner.nextInt();

	    //System.out.println("Enter a double:");
	    double d = scanner.nextDouble();
	    scanner.nextLine(); // Consume the newline character after the double

	    //System.out.println("Enter a string:");
	    String str = scanner.nextLine();

	    scanner.close();

	    System.out.println("String: " + str);
	    System.out.println("Double: " + d);
	    System.out.println("Int: " + integer);

}
}