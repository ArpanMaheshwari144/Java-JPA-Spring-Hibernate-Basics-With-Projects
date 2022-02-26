package myprograms;

import java.util.Scanner;

public class Account {
	
	static Scanner in = null;
	
	static double bankBalance;
	static double accountBalance;
	
	static void openAccount(double amount) {
		System.out.print("Opening account with amount of: ");
		double amount1 = in.nextDouble();
		accountBalance = accountBalance + amount1;
		bankBalance = bankBalance + amount1;
	}
	
	static void depositBalance(double amount) {
		System.out.print("Depositing amount: ");
		double amount1 = in.nextDouble();
		accountBalance = accountBalance + amount1;
		bankBalance = bankBalance + amount1;
	}
	
	static void withdrawBalance(double amount) {
		System.out.print("Enter withdraw amount: ");
		double amount1 = in.nextDouble();
		accountBalance = accountBalance - amount1;
		bankBalance = bankBalance - amount1;
		System.out.println("New updated balance " + accountBalance);
	}
	
	static void checkBalance() {
		System.out.println("Available balance is " + accountBalance);
	}
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		double amount = 0.0;
		
		Account.openAccount(amount);
		Account.checkBalance();
		Account.depositBalance(amount);
		Account.withdrawBalance(amount);
		Account.checkBalance();
	}
}
