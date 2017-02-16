package assignment04;

import java.util.ArrayList;
import java.util.Arrays;
import static assignment04.ArrayListPractice.*;

public class ArrayListTester {
	public static void main(String [] args) {
		System.out.println("Provided Test Cases");
		ArrayList<Integer> simple = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		ArrayList<Integer> reversed = new ArrayList<>(Arrays.asList(6,5,4,3,2,1));
		test(reversed, reverse(simple));
		test(simple, reverse(reversed));
		test(true, isIncreasing(simple));
		test(false, isIncreasing(reversed));
		
		try {
			concatenate(null, null);
			System.out.println("concatenate: test failed - exception not thrown");
		} catch(IllegalArgumentException e) {
			System.out.println("concatenate: caught the expected illegal arument exception");
		}
		
		try {
			endToEnd(null, null);
			System.out.println("endToEnd: test failed - exception not thrown");
		} catch(IllegalArgumentException e) {
			System.out.println("endToEnd: caught the expected illegal argument exception");
		}
		
		//Null ArrayList Test
		System.out.println("\nNull ArrayList Test");
		ArrayList<Integer> n = null;
		test("null", reverse(n));
		reverseInPlace(n);
		test("null", n);
		
		//Empty ArrayList Test
		System.out.println("\nEmpty ArrayList Test");
		ArrayList<Integer> empty = new ArrayList<>();
		test(true, isNonDecreasing(empty));
		test(true, isIncreasing(empty));
		test(empty, reverse(empty));
		reverseInPlace(empty);
		test(empty, empty);
		test(simple, concatenate(empty, simple));
		test(simple, concatenate(simple, empty));
		test(reversed, endToEnd(empty, simple));
		test(simple, endToEnd(simple, empty));
		
		//Reverse ArrayList Test
		System.out.println("\nReverse partially null arraylist");
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(null,3,4,null,6));
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(null,3,null,4,null,5));
		test("[6, null, 4, 3, null", reverse(arr1));
		test("[5, null, 4, null, 3, null]", reverse(arr2));
		
		//Varying Length ArrayList Test
		System.out.println("\nVarying Length ArrayList Test");
		ArrayList<Integer> len1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> len2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
		ArrayList<Integer> len3 = new ArrayList<>(Arrays.asList(0,2,4,6,8,10));
		test("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", concatenate(len1, len2));
		test("[1, 2, 3, 4, 5, 0, 2, 4, 6, 8, 10]", concatenate(len1, len3));
		test("[1, 2, 3, 4, 5, 10, 9, 8, 7, 6]", endToEnd(len1, len2));
		test("[1, 2, 3, 4, 5, 10, 8, 6, 4, 2, 0]", endToEnd(len1, len3));
		
		//NonDecreasing/Increasing Test
		System.out.println("\nNonDecreasing/Increasing Test");
		ArrayList<Integer> test1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> test2 = new ArrayList<>(Arrays.asList(1,2,2,3,4));
		ArrayList<Integer> test3 = new ArrayList<>(Arrays.asList(1,5,3,2,4));
		test(true, isNonDecreasing(test1));
		test(true, isNonDecreasing(test2));
		test(false, isNonDecreasing(test3));
		test(true, isIncreasing(test1));
		test(false, isIncreasing(test2));
		test(false, isIncreasing(test3));
		
		//Even/Odd Length ArrayList Test
		System.out.println("\nEven/Odd Length ArrayList Test");
		ArrayList<Integer> even = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		ArrayList<Integer> odd = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		test("[6, 5, 4, 3, 2, 1]", reverse(even));
		test("[5, 4, 3, 2, 1]", reverse(odd));
		reverseInPlace(even);
		test("[6, 5, 4, 3, 2, 1]", even);
		reverseInPlace(odd);
		test("[5, 4, 3, 2, 1]", odd);
	}
	
	public static void test(String expected, ArrayList<Integer> actual) {
		System.out.println("Expected: " + expected +
                                   ", received: " + actual);
	}

	public static void test(ArrayList<Integer> expected, ArrayList<Integer> actual) {
		System.out.println("Expected: " + expected +
                                   ", received: " + actual);
	}

	public static void test(boolean expected, boolean actual) {
		System.out.println("Expected: " + expected + ", received: " + 					   actual);
	}
}
