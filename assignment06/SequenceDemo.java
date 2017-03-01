package assignment06;

public class SequenceDemo {
	public static void main(String[] args) {
		LastDigitDistribution dist1 = new LastDigitDistribution();
		dist1.process(new SquareSequence(), 1000);
		dist1.display();
		System.out.println();
		
		LastDigitDistribution dist2 = new LastDigitDistribution();
		dist2.process(new RandomSequence(), 1000);
		dist2.display();
		System.out.println();
		
		LastDigitDistribution dist3 = new LastDigitDistribution();
		dist3.process(new PrimeSequence(), 1000);
		dist3.display();
		System.out.println();
		
		FirstDigitDistribution dist4 = new FirstDigitDistribution();
		dist4.process(new SquareSequence(), 1000);
		dist4.display();
		System.out.println();
		
		FirstDigitDistribution dist5 = new FirstDigitDistribution();
		dist5.process(new RandomSequence(), 1000);
		dist5.display();
		System.out.println();
		
		FirstDigitDistribution dist6 = new FirstDigitDistribution();
		dist6.process(new PrimeSequence(), 1000);
		dist6.display();
	}
}
