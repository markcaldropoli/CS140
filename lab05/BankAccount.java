package lab05;

public class BankAccount {
	private double balance;
	private int idNum;
	private static int numAccounts = 0;

	public BankAccount(double balance) {
		if(balance >= 0) {
			this.balance = balance;
		} else {
			throw new IllegalArgumentException("Balance cannot be negative");
		}
		idNum = numAccounts;
		numAccounts++;
	}

	public double getBalance() {
		return balance;
	}

	public int getIDNum() {
		return idNum;
	}

	@Override
	public String toString() {
		return "Acct. "+idNum+" has $"+balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public double withdraw(double amount) {
		if(amount >= balance) {
			double temp = balance;
			balance = 0;
			return temp;
		} else {
			balance -= amount;
			return amount;
		}
	}
}
