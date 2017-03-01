package assignment06;

import java.text.NumberFormat;

public class DecimalSeparatorFormatter implements NumberFormatter {
	public String format(int n) {
		return NumberFormat.getInstance().format(n);
	}
}
