package assignment06;

public class PrimeSequence implements Sequence {
	private int n = 1;
	
	public int next() {
		do {
		    n += 1;
		} while (!isPrime(n));
		return n;
	}
	
	public boolean isPrime(int x) {
		if(x > 2 && (x & 1) == 0) {
		       return false;
		}
		for(int i = 3; i * i <= x; i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
