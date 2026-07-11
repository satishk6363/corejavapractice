package com.methods;

import java.util.Scanner;
public class MyName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your First Name : ");
	    String Firstname = sc.nextLine();
		System.out.println("Please Enter your Last Name : ");
        String Lastname = sc.next();
        
        MyName obj = new MyName();
       String name = obj.FullName(Firstname, Lastname);
       System.out.println(name);
        	
}
	
	String FullName(String FirstName , String LastName) {
		String fname = FirstName + " " +  LastName;
		return fname;
	}
	
}
