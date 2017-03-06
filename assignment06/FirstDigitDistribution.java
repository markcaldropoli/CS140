package assignment06;

public class FirstDigitDistribution {
	private int[] counters;
	
	public FirstDigitDistribution() {
		counters = new int[10];
	}
	
	public void process(Sequence seq, int valuesToProcess) {
		for(int i=1; i<=valuesToProcess; i++) {
			int value = seq.next();
			int firstDigit = Integer.parseInt(Integer.toString(value).substring(0, 1));
			counters[firstDigit]++;
		}
	}
	
	public void display() {
		int biggest = 0;
		for(int i=0; i<counters.length; i++) {
			if(counters[i] > biggest) {
				biggest = counters[i];
			}
		}
		for(int i=0; i<counters.length; i++) {
			System.out.print(i+": ");
			int scale = (int)Math.round((40.0*counters[i])/biggest);
			for(int j=0; j<scale; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
