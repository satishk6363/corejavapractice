package com.k8s1;

public class Sum {
	 int num1=20;
	 int num2=30;
	public static int getTotal(int num1,int num2) {
		
		return num1+num2;
	}
	public static void main(String[] args) {
		Sum sum = new Sum();
		//System.out.println(sum.num1);
		//System.out.println(sum.num2);
		System.out.println(sum.num1+sum.num2);
	}


}
