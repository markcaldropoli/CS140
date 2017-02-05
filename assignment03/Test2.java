package assignment03;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		double v1 = 5.0;
		double[] arr1 = {1.0,2.0,3.0,4.0,5.0}; //Positive Case - Returns index
		double[] arr2 = {-1.0,-2.0,-3.0,-4.0,-5.0}; //Negative Case - Returns -1
		double[] arr3 = null; //Null Case - Returns -3
		double[] arr4 = new double[0]; //Empty Case - Returns -2
		
		System.out.println("Test indexOf:");
		System.out.println(Assig3.indexOf(v1, arr1));
		System.out.println(Assig3.indexOf(v1, arr2));
		System.out.println(Assig3.indexOf(v1, arr3));
		System.out.println(Assig3.indexOf(v1, arr4));
		
		System.out.println("\nTest indexOf2:");
		System.out.println(Assig3.indexOf2(v1, arr1));
		System.out.println(Assig3.indexOf2(v1, arr2));
		System.out.println(Assig3.indexOf2(v1, arr3));
		System.out.println(Assig3.indexOf2(v1, arr4));
				
		int v2 = 5;
		int[] arr5 = {1,2,3,4,5}; //Case with value
		int[] arr6 = {1,2,3,4,6}; //Case without value
		int[] arr7 = {0,1,2,3,4}; //Case with arr < value
		int[] arr8 = {6,7,8,9,10}; //Case with value < arr[0]
		
		System.out.println("\nTest indexOf3:");
		System.out.println(Assig3.indexOf3(v2, arr5));
		System.out.println(Assig3.indexOf3(v2, arr6));
		System.out.println(Assig3.indexOf3(v2, arr7));
		System.out.println(Assig3.indexOf3(v2, arr8));
		
		System.out.println("\nTest insertIfNeeded:");
		System.out.println(Arrays.toString(Assig3.insertIfNeeded(v2, arr5)));
		System.out.println(Arrays.toString(Assig3.insertIfNeeded(v2, arr6)));
		System.out.println(Arrays.toString(Assig3.insertIfNeeded(v2, arr7)));
		System.out.println(Arrays.toString(Assig3.insertIfNeeded(v2, arr8)));
	}

}
