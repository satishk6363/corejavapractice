package com.k8s1;

//methodtypes

public class Bank {

	static int currentBalance = 1000;
	public static void greetCustomer() {
		System.out.println("Hello, Welcome to the banking application");

	}
	public  void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Amount is deposited sucessfuly");
	}
	public  static void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount is withdeawn sucessfully");
	}
	public int getCurrentBalance() {
		return currentBalance;
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		greetCustomer();
		System.out.println("current balance is: "+bank.getCurrentBalance());
		bank.deposit(500);
		System.out.println("current balance is: "+bank.getCurrentBalance());
		withdrawal(100);
		System.out.println("current balance is: "+bank.getCurrentBalance());
	}

}
