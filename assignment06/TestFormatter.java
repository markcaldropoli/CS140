package assignment06;

public class TestFormatter {
	public static void main(String[] args) {
		int n1 = 1000000;
		int n2 = -5000;
		
		System.out.println("Default Formatter");
		DefaultFormatter f1 = new DefaultFormatter();
		System.out.println("n1: "+f1.format(n1));
		System.out.println("n2: "+f1.format(n2));
		
		System.out.println("\nDecimal Separator Formatter");
		DecimalSeparatorFormatter f2 = new DecimalSeparatorFormatter();
		System.out.println("n1: "+f2.format(n1));
		System.out.println("n2: "+f2.format(n2));
		
		System.out.println("\nAccounting Formatter");
		AccountingFormatter f3 = new AccountingFormatter();
		System.out.println("n1: "+f3.format(n1));
		System.out.println("n2: "+f3.format(n2));
		
		System.out.println("\nBase Formatter");
		BaseFormatter f4 = new BaseFormatter(2);
		System.out.println("n1: "+f4.format(n1));
		System.out.println("n2: "+f4.format(n2));
	}
}
