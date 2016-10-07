package PracticeSet3Maven.ps3;

import java.util.Date;

import exception.fundsException;

public class Account {

	public static void main(String[] args) {}
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		Date dateCreated = this.dateCreated;
	}

	private Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}

	// Accessors and Mutuators for id, balance, and annualInterestRate
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	public void setAnnualInterestRate() {
		this.annualInterestRate = annualInterestRate;
	}

	// accessor for dateCreated
	public Date getDateCreater() {
		return this.dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (this.annualInterestRate) / 12;

	}

	public void withdrawl(double amount) throws fundsException {
		if (amount <= balance)
			balance -= amount;
		else {
			double required = amount - balance;
			throw new fundsException(required);
		}
	}

	public void deposit(double amount) {
		balance += amount;
	}
}
