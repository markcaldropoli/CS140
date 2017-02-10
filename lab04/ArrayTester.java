package lab04;

import java.util.Arrays;
import static lab04.ArrayPractice.*;

public class ArrayTester {
	public static void main(String [] args) {
		System.out.println("Provided Test Cases");
		int[] simple = {1, 2, 3, 4, 5, 6};
		int[] reversed = {6, 5, 4, 3, 2, 1};
		test(reversed, reverse(simple));
		test(simple, reverse(reversed));
		test(true, isIncreasing(simple));
		test(false, isIncreasing(reversed));

		try {
			concatenate(null, null);
			System.out.println("concatenate: test failed - exception not thrown");
		} catch(IllegalArgumentException e) {
			System.out.println("concatenate: caught the expected illegal argument exception");
		}
		
		try {
			endToEnd(null, null);
			System.out.println("endToEnd: test failed - exception not thrown");
		} catch(IllegalArgumentException e) {
			System.out.println("endToEnd: caught the expected illegal argument exception");
		}

		//Null Array Test
		System.out.println("\nNull Array Test");
		int[] n = null;
		test(true, isNonDecreasing(n));
		test(true, isIncreasing(n));
		test("null", reverse(n));
		reverseInPlace(n);
		test("null", n);

		//Empty Array Test
		System.out.println("\nEmpty Array Test");
		int[] empty = new int[0];
		test(true, isNonDecreasing(empty));
		test(true, isIncreasing(empty));
		test(empty, reverse(empty));
		reverseInPlace(empty);
		test(empty, empty);
		test(simple, concatenate(empty, simple));
		test(simple, concatenate(simple, empty));
		test(reversed, endToEnd(empty, simple));
		test(simple, endToEnd(simple, empty));

		//Varying Length Array test
		System.out.println("\nVarying Length Array Test");
		int[] len1 = {1, 2, 3, 4, 5};
		int[] len2 = {6, 7, 8, 9, 10};
		int[] len3 = {0, 2, 4, 6, 8, 10};
		test("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", concatenate(len1, len2)); //Same Length
		test("[1, 2, 3, 4, 5, 0, 2, 4, 6, 8, 10]", concatenate(len1, len3)); //Different Length
		test("[1, 2, 3, 4, 5, 10, 9, 8, 7, 6, 5]", endToEnd(len1, len2)); //Same Length
		test("[1, 2, 3, 4, 5, 10, 8, 6, 4, 2, 0]", endToEnd(len1, len3)); //Different Length
		
		//NonDecreasing/Increasing Test
		System.out.println("\nNonDecreasing/Increasing Test");
		int[] test1 = {1, 2, 3, 4, 5};
		int[] test2 = {1, 2, 2, 3, 4};
		int[] test3 = {1, 5, 3, 2, 4};
		test(true, isNonDecreasing(test1));
		test(true, isNonDecreasing(test2));
		test(false, isNonDecreasing(test3));
		test(true, isIncreasing(test1));
		test(false, isIncreasing(test2));
		test(false, isIncreasing(test3));
		
		//Even/Odd Length Array Test
		System.out.println("\nEven/Odd Length Array Test");
		int[] even = {1, 2, 3, 4, 5, 6};
		int[] odd = {1, 2, 3, 4, 5};
		test("[6, 5, 4, 3, 2, 1", reverse(even));
		test("[5, 4, 3, 2, 1", reverse(odd));
		reverseInPlace(even);
		test("[6, 5, 4, 3, 2, 1]", even);
		reverseInPlace(odd);
		test("[5, 4, 3, 2, 1]", odd);
	}

	public static void test(String expected, int[] actual) {
		System.out.println("Expected: " + expected +
                                   ", received: " + Arrays.toString(actual));
	}

	public static void test(int[] expected, int[] actual) {
		System.out.println("Expected: " + Arrays.toString(expected) +
                                   ", received: " + Arrays.toString(actual));
	}

	public static void test(boolean expected, boolean actual) {
		System.out.println("Expected: " + expected + ", received: " + 					   actual);
	}
}
