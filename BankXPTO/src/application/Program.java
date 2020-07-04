package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = input.nextInt();
		System.out.print("Enter account holder: ");
		input.nextLine();
		String name = input.nextLine();

		System.out.print("Is there a initial deposit(y/n)? ");
		char response = input.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = input.nextDouble();
			account = new Account(number, name, initialDeposit); 
		}
		else {
			account = new Account(number, name); 
		}

		System.out.println();
		System.out.println("Account data: \n" + account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = input.nextDouble();
		account.deposit(depositValue); 
		System.out.println("Updated account data: \n" + account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = input.nextDouble();
		account.withdraw(withdrawValue); 
		System.out.println("Updated account data: \n" + account);

		input.close(); 
	} 
}
