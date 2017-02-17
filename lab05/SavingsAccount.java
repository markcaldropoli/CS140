package lab05;

/* Greeter:
 * 
 * Entering Greet::sayHi
 * Hello, Bob.
 * Exiting Greeter::sayHi
 *
 * InquisitiveGreeter:
 *
 * Entering InquisitiveGreeter::sayHi
 * Hello, Bob.
 * How are you, Bob?
 * Exiting InquisitiveGreeter::sayHi
 */
public class SavingsAccount extends BankAccount {
	private double rate;

	public SavingsAccount(double balance, double rate) {
		super(balance);
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	@Override
	public void deposit(double amount) {
		super.deposit(amount+(rate*amount));
	}

	@Override
	public String toString() {
		return super.toString()+" @ "+rate+"%";
	}
}
