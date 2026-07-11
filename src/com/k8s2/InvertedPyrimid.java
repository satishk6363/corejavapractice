package com.k8s2;

public class InvertedPyrimid {
	public static void main(String[] args) {
		int n = 5; //rows
		for(int i=n;i>=1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
}
