package assignment06;

public class BaseFormatter implements NumberFormatter {
	private int num;
	
	public BaseFormatter(int n) {
		this.num = n;
	}
	
	public String format(int n) {
		return Integer.toString(n, num);
	}
}
