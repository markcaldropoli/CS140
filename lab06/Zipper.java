package lab06;

public class Zipper {
	public static int[] zip(int[] arr1, int[] arr2) {
		if(arr1 == null || arr2 == null || arr1.length != arr2.length) {
			throw new IllegalArgumentException("bad input");
		} else if(arr1.length == 0) {
			int[] empty = new int[0];
			return empty;
		} else {
			int[] newArr = new int[arr1.length+arr2.length];
			int position = 0;
			for(int i=0; i<arr1.length; i++) {
				newArr[position] = arr1[i];
				position+=2;
			}
			position = 1;
			for(int i=0; i<arr2.length; i++) {
				newArr[position] = arr2[i];
				position+=2;
			}
			return newArr;
		}
	}
}
