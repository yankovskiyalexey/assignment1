package com.meritamerica.assignment2;

public class BankAccount {

	private double balance;
	private double interestRate = 0;

	public BankAccount(double openingBalance, double interestRate) {

		balance = openingBalance;
		this.interestRate = interestRate;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	boolean withdraw(double amount) {
		if (amount < 0) {
			return false;
		}
		if (amount > balance) {
			return false;
		}
		balance -= amount;
		return true;
	}

	boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		}
		balance += amount;
		return true;
	}

	double futureValue(int years) {
		return balance * Math.pow(1 + interestRate, years);
	}

	

	@Override
	public String toString() {
		return "\nChecking Account Balance: $" + String.format("%.2f", this.getBalance())
				+ "\nChecking Account Interest Rate: " + String.format("%.4f", this.getInterestRate())
				+ "\nChecking Account Balance in 3 years: " + String.format("%.2f", this.futureValue(3));
	}
}
