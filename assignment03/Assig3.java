package assignment03;

public class Assig3 {
	public static boolean hasNegative(double[] arr) {
		boolean hasNeg = false;
		if(arr != null) {
			for(int i=0; i<arr.length && !hasNeg; i++) {
				if(arr[i] < 0) {
					hasNeg = true;
				}
			}
		}
		return hasNeg;
	}
	
	public static int indexOf(double value, double[] arr) {
		int returnVal = -4;
		if(arr == null) {
			returnVal = -3;
		} else if(arr.length == 0) {
			returnVal = -2;
		} else {
			boolean b = false;
			for(int i=0; i<arr.length && !b; i++) {
				if(Math.abs(value - arr[i]) < 1e-9) {
					returnVal = i;
					b = true;
				}
			}
			if(!b) {
				returnVal = -1;
			}
		}
		return returnVal;
	}
	
	public static int indexOf2(double value, double[] arr) {
		if(arr == null) {
			return -3;
		}
		if(arr.length == 0) {
			return -2;
		}
		boolean b = false;
		for(int i=0; i<arr.length && !b; i++){
			if(Math.abs(value - arr[i]) < 1e-9) {
				b = true;
				return i;
			}
		}
		return -1;
	}
	
	public static int indexOf3(int value, int[] arr) {
		boolean check = false;
		int index = -1;
		for(int i=0; i<arr.length && !check; i++) {
			if(arr[i] == value) {
				index = i;
				check = true;
			} else {
				if(arr[i] > value-1) {
					index = -1*i-1;
					check = true;
				}
			}
		}
		if(!check && value > arr[arr.length-1]) {
			index = -arr.length-1;
		}
		if(value < arr[0]) {
			index = -1;
		}
		return index;
	}
	
	public static int[] insertIfNeeded(int value, int[] arr) {
		int k = indexOf3(value, arr);
		if(k >= 0) {
			return arr;
		} else {
			int[] arr1 = new int[arr.length+1];
			System.arraycopy(arr, 0, arr1, 0, -k-1);
			arr1[-k-1] = value;
			System.arraycopy(arr, -k-1, arr1, -k, arr.length+k+1);
			return arr1;
		}
	}
}
