package entities;

public class Bank {
	
	private int number;
	private String holder;
	private double balance;
	
	public Bank(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Bank(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance = (this.balance - amount) - 5;
	}
	
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f", number, holder, balance);
	}
}
