package assignment06;

public class DecimalSeparatorFormatter implements NumberFormatter {
	public String format(int n) {
		String num = "";
		if(n < 0) {
			num = ""+(-n);
		} else {
			num = ""+n;
		}
		if(num.length() > 3) {
			for(int i=num.length()-3; i>0; i-=3) {
				num = num.substring(0,i) + "," + num.substring(i, num.length());
			}
		}
		if(n<0) {
			return "-"+num;
		} else {
			return num;
		}
	}
}
