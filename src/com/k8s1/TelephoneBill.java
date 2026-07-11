package com.k8s1;

import java.util.Scanner;

public class TelephoneBill {
	public static void main(String[] args) {
		int numberofcalls;
		double bill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of calls:");
		numberofcalls = sc.nextInt();
		if(numberofcalls<=100) {
			bill = 200;
		}
		else if(numberofcalls<=150)
		{
			bill = 200 + (numberofcalls - 100)*0.60;
		}
		else if(numberofcalls<=200) {
			bill = 200+50*0.60+(numberofcalls-150)*0.50;
			
		}
		else {
			bill = 200+50*0.60+50*0.50+(numberofcalls - 200)*0.40;
			
		}
		System.out.println("The bill is rs."+ bill);
	}
}


