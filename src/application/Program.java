package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Account acc;

		System.out.print("Enter account number: ");
		int number = in.nextInt();
		in.nextLine();
		System.out.print("Enter account holder: ");
		String holder = in.nextLine();

		System.out.print("Is there initial deposit (y/n)? ");
		char depositInit = in.next().charAt(0);

		if (depositInit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = in.nextDouble();
			System.out.println();
			acc = new Account(number, holder, balance);
			System.out.println("Account data: ");
			System.out.println(acc);
			System.out.println();

		} else {
			acc = new Account(number, holder);
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(acc);
			System.out.println();
		}

		System.out.print("Enter a deposit value: ");
		double amount = in.nextDouble();
		acc.deposit(amount);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = in.nextDouble();
		acc.withdraw(amount);
		System.out.println("Updated account data: ");
		System.out.println(acc);

		in.close();
	}

}
