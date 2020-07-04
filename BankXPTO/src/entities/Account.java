package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder; 
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public String getName() {
		return holder;
	}
	
	public void setName(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getNumber() {
		return number;
	} 
	
	public String toString() {
		return "Account " + number + ", Holder: " + 
				holder + ", Balance: $" + String.format("%.2f", balance);
	} 
	
	public void deposit(double amount) {
		this.balance += amount; 
	}
	
	public void withdraw(double amount) {
		if (this.balance >= amount + 5.00) {
			this.balance -= (amount + 5.00);
//			this.balance = this.balance - balance - 5.00;
			
		}
	} 
} 
