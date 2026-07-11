package com.k8s1;

public class Constructor_practice {
	public int i;
	public static void main(String[] args) {
		Constructor_practice cp = new Constructor_practice(56);
		System.out.println(cp.i);
	}
	public Constructor_practice() {
		
	}
    public Constructor_practice(int a) {
    	System.out.println("This is parametrised constructor");
		
	}

}
