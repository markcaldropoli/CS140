package lab03;

import java.util.Arrays;

public class ArrayTester {
	public static void main(String [] args) {
		if(args.length == 1) {			
			ArrayFromFile aff = new ArrayFromFile(args[0]);
			System.out.println("Expected: [20, 8, 13, 46, 7]");
			System.out.println(aff);

			aff.removeOddElements();
			System.out.println("\nExpected: [20, 8, 46]");
			System.out.println(aff);
		} else {
			throw new IllegalArgumentException("You did not provide exactly 1 argument.");
		}
		System.out.println();

		int[] array = new int[5];
		System.out.println(Arrays.toString(array));
		int n=0;
		for(int i : array) {
			i = n;
			n++;
		}
		System.out.println("\nExpected: The same array of zeroes as before because the enhanced for loop creates a reference variable to each element of the array, therefore not changing the actual array.");
		System.out.println(Arrays.toString(array));
		System.out.println();

		String[] s = {"java", "python", "c", "assembly"};
		for(String element : s) {
			System.out.println(element+" "+element.length());
		}
	}
}
