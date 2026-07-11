package com.k8.looping;

public class Looping5 {

	public static void main(String[] args) {
		int num = 50;
		int i;
		while(num<=150) {
			   boolean isPrime = true;
	               i = 2;

	            while (i <= Math.sqrt(num)) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	                i++;
	            }

	            if (isPrime) {
	                System.out.print(num + " ");
	            }

	            num++;
	        }

	}

}
