package assignment02;

public class OneChange {
	private int[] array;
	
	public OneChange(int[] a) {
		this.array = a;
	}
	
	public int smallestAfter(int start) {
		int index = start;
		for(int i=start+1; i<array.length; i++) {
			if(array[i] < array[index]) {
				index = i;
			}
		}
		return index;
	}
	
	public int[] modify(int start) {
		int[] temp = new int[array.length];
		int k = smallestAfter(start);
		for(int i=0; i<start; i++) {
			temp[i] = array[i];
		}
		temp[start] = array[k];
		for(int i=start; i<k; i++) {
			temp[i+1] = array[i];
		}
		for(int i=k+1; i<array.length; i++) {
			temp[i] = array[i];
		}
		return temp;
	}
}
