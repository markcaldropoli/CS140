package assignment02;

public class WeirdSorter {
	private int[] array;
	
	public WeirdSorter(int[] a) {
		this.array = a;
	}
	
	public int[] sorted() {
		for(int i=0; i<array.length-1; i++) {
			OneChange one = new OneChange(array);
			array = one.modify(i);
		}
		return array;
	}
}
