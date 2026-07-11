package com.k8s1;

import java.util.Scanner;

public class DiscountRevenue {
	public static void main(String[] args) {
		int revenue,price,quantity;
		int discount = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter price of product:");
		price = sc.nextInt();
		System.out.println("Enter quantity of product:");
		quantity =sc.nextInt();
		revenue = price*quantity;
		if(revenue>5000) {
			discount = revenue*10/100;
			revenue = revenue - discount;
		
		}
		System.out.println("The discount is:" + discount);
		System.out.println("The net revenue is:" + revenue);
		
	}

}
