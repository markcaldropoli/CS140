package lab05;

import java.util.ArrayList;

public class BankTester {
	public static void main(String[] args) {
		ArrayList<BankAccount> accounts = new ArrayList<>();
		BankAccount acc0 = new BankAccount(100.5);
		SavingsAccount acc1 = new SavingsAccount(300,.1);
		CheckingAccount acc2 = new CheckingAccount(600.21,5);
		BankAccount acc3 = new BankAccount(3000.24);
		SavingsAccount acc4 = new SavingsAccount(500,.2);
		CheckingAccount acc5 = new CheckingAccount(56.32,2);

		accounts.add(acc0);
		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(acc3);
		accounts.add(acc4);
		accounts.add(acc5);

		System.out.println(accounts+"\n");

		for(BankAccount acc : accounts) {
			acc.deposit(50.50);
		}

		System.out.println("Deposit Test:");
		System.out.println(accounts+"\n");

		System.out.println("Withdraw Test:");
		for(int i=0; i<acc2.getWithdrawLimit(); i++) {
			for(BankAccount acc : accounts) {
				acc.withdraw(10);
			}
			System.out.println(accounts);
		}

		ArrayList<Object> objects = new ArrayList<>();
		objects.add(acc0);
		objects.add(32);
		objects.add(75.0);
		objects.add(true);
		objects.add(acc4);
		objects.add(accounts);
		objects.add(false);
		objects.add(acc5);

		System.out.println("\n"+objects);
	}
}
