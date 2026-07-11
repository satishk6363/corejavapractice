package com.k8.looping;

public class Looping6 {

	public static void main(String[] args) {
		int num = 40;
		int sum = 0;
		while(num<=80) {
			if(num%2==0) {
				sum+=num;
			}
			num++;
		}
		System.out.println(sum);

	}

}
