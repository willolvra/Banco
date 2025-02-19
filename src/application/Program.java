package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit(y/n): ");
		char choice = sc.next().charAt(0);
		
		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double amount = sc.nextDouble();
			bank = new Bank(number , holder, amount);
		}
		else {
			bank = new Bank(number , holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		bank.deposit(amount);
		
		System.out.println("Updated account data: ");
		System.out.println(bank);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		bank.withdraw(amount);
		
		System.out.println("Updated account data: ");
		System.out.println(bank);
		System.out.println();
		
		sc.close();
	}

}
