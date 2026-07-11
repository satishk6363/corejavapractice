package com.methods;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		SumOfNumbers obj = new SumOfNumbers();
		obj.sum();
		
		//obj.sub(30,20);
		//obj.sub(300,200);
		//obj.sub(40,60);
		
		productoftwonums(3,5);
		
		int product1 = obj.prodOfNums(5,8);
		System.out.println("product1 :" + " " + product1);
		
		int product2 = obj.prodOfNums(6,6);
		System.out.println("product2 :" + " " + product2);
		
		obj.sub(product1 ,product2);
		obj.productoftwonums(product1,product2);
		
		
	}
	void sum() {
		int a = 10;
		int b = 20;
		
		int c = a+b;
		System.out.println(c);
		
	}
	void sub (int a, int b) {
		
		int c = a-b;
		System.out.println("Subtract :" + " " + c );
		
		
	}
	static void productoftwonums(int a, int b) {
		int c =a*b;
		System.out.println("product : " + c);
		
	}
	
	int prodOfNums(int a, int b) {
		int c = a*b;
		return c;
	}

}
