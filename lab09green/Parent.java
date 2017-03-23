package lab09green;

public class Parent {
	private int[] arr;
	
	public Parent(int[] arr) {
		this.arr = arr;
	}
	
	public double average() {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		int sum = 0;
		for(int x : arr) {
			sum += x;
		}
		double avg = (double)sum/arr.length;
		return avg;
	}
	
	public int min() {
		if(arr == null || arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		int smallest = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		return smallest;
	}
}
