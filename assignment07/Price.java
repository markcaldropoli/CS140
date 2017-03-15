package assignment07;

public class Price {
	private long dollars;
	private int cents;
	
	public Price(long dollars, int cents) {
		if(dollars < 0 || cents < 0 || cents >= 100) {
			throw new IllegalArgumentException("Dollars must be greater than zero and cents must be between 0 and 99");
		} else {
			this.dollars = dollars;
			this.cents = cents;
		}
	}
	
	public void changeUp(double percent) {
		double total = dollars+(cents/100.);
		total = total * ((percent/100) + 1);
		String[] money = String.valueOf(total).split("\\.");
		money[1] = money[1].substring(0,2);
		dollars = Long.parseLong(money[0]);
		cents = Integer.parseInt(money[1]);
	}
	
	public void changeDown(double percent) {
		double total = dollars+(cents/100.);
		total = total * ((100-percent)/100);
		String[] money = String.valueOf(total).split("\\.");
		money[1] = money[1].substring(0,2);
		dollars = Long.parseLong(money[0]);
		cents = Integer.parseInt(money[1]);
	}
	
	public String toString() {
		if(cents < 10) {
			return "$"+dollars+".0"+cents;
		} else {
			return "$"+dollars+"."+cents;
		}
	}
}
