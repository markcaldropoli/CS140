package assignment04;

import java.util.ArrayList;

public class ArrayListPractice {
	/**
 	 * Determines if an arraylist's elements are in non-decreasing order.
 	 * The arraylist {1, 2, 2, 3, 4} is in non-decreasing order while
	 * the arraylist {1, 3, 4, 2, 5} is not in non-decreasing order as 2 < 4.
	 * A null arraylist is ignored. An empty arraylist is by default in non-decreasing order.
	 * @param array the arraylist to inspect
	 * @return true if the arraylist's elements are in non-decreasing order,
	 * or the arraylist is empty false otherwise
	 */
	public static boolean isNonDecreasing(ArrayList<Integer> array) {
		if(array.size() == 0) {
			return true;
		} else {
			for(int i=0; i<array.size()-1; i++) {
				if(array.get(i) > array.get(i+1)) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Determines if an arraylist's elements are in strictly increasing order.
	 * The arraylist {1, 2, 3, 4, 5} is in increasing order while
	 * the arraylist {1, 2, 2, 4, 5} is not in increasing order as 2 == 2.
	 * A null arraylist is ignored. An empty arraylist is by default in increasing order.
	 * @param array the arraylist to inspect
	 * @return true if the arraylist's elements are in increasing order,
	 * or the arraylist is empty false otherwise
	 */
	public static boolean isIncreasing(ArrayList<Integer> array) {
		//TODO null should be ignore - refer to Piazza
		if(array == null || array.size() == 0) {
			return true;
		}
		for(int i=0; i<array.size()-1; i++) {
			if(array.get(i) >= array.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Computes the reverse an arraylist.
	 * The reverse of a null arraylist is null.
	 * The reverse of an empty arraylist is the empty arraylist.
	 * @param array the arraylist whose elements are to be reversed
	 * @return an arraylist holding the contents of array in reverse order
	 */
	public static ArrayList<Integer> reverse(ArrayList<Integer> array) {
		if(array == null) {
			return null;
		} else if(array.size() == 0) {
			return array;
		} else {
			ArrayList<Integer> reverse = new ArrayList<>(array.size());
			for(int i=0; i<array.size(); i++) {
				reverse.add(array.get(array.size()-1-i));
			}
			return reverse;
		}
	}
	
	/**
	 * Computes an arraylist that is all the elements of arr1 in order,
	 * followed by the elements of arr2 in order.
	 * An empty arraylist should contribute no elements to the concatenated
	 * arraylist.
	 * e.g. concatenate({1,2 3}, {4, 5, 6}) should return {1, 2, 3, 4, 5,6}
	 * @param arr1 the first non-null arraylist
	 * @param arr2 the second non-null arraylist
	 * @return an arraylist that is all the elements of arr1 in order,
	 * followed by the elements of arr2 in order.
	 * @throws IllegalArgumentException if arr1 or arr2 is null
	 */
	public static ArrayList<Integer> concatenate(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		if(arr1 == null || arr2 == null) {
			throw new IllegalArgumentException("arr1 or arr2 is null");
		} else if(arr1.size() == 0) {
			return arr2;
		} else if(arr2.size() == 0) {
			return arr1;
		} else {
			ArrayList<Integer> combined = new ArrayList<>(arr1.size()+arr2.size());
			for(int i=0; i<arr1.size(); i++) {
				combined.add(arr1.get(i));
			}
			for(int i=0; i<arr2.size(); i++) {
				combined.add(arr2.get(i));
			}
			return combined;
		}
	}
	
	/**
	 * Computes an arraylist that is all the elements of arr1 in order,
	 * followed by the elements of arr2 in reverse order
	 * An empty arraylist should contribute no elements to the resulting arraylist.
	 * e.g. endToEnd({1, 2, 3}, {1, 2, 3}) should return {1, 2, 3, 3, 2, 1}
	 * HINT: this method can use other methods in this class to assist it.
	 * Ideally, this method is one short line of code.
	 * @param arr1 the first non-null arraylist
	 * @param arr2 the second non-null arraylist
	 * @return an arraylist that is all the elements of arr1 in order,
	 * followed by the elements of arr2 in reverse order
	 * @throws IllegalArgumentException if arr1 or arr2 is null
	 */
	public static ArrayList<Integer> endToEnd(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		return concatenate(arr1, reverse(arr2));
	}
	
	/**
	 * Reverses the given arraylist in-place.
	 * Zero credit if another arraylist is made.
	 * The reverse of a null arraylist is null.
	 * The reverse of an empty arraylist is the empty arraylist.
	 * HINT: since we cannot make another arraylist, we will have to swap certain
	 * elements one-by-one.
	 * @param array the arraylist to reverse
	 */
	public static void reverseInPlace(ArrayList<Integer> array) {
		if(array == null) {
			array = null;
		} else if(array.size() == 0) {
			
		} else {
			for(int i=0; i<array.size()/2; i++) {
				int temp = array.get(i);
				array.set(i, array.get(array.size()-1-i));
				array.set(array.size()-1-i, temp);
			}
		}
	}
}
