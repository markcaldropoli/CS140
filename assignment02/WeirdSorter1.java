package assignment02;

public class WeirdSorter1 {
	private int[] array;
	
	public WeirdSorter1(int[] a) {
		this.array = a;
	}
	
	public int[] sorted() {
		for(int i=0; i<array.length-1; i++) {
			OneChange1 one = new OneChange1(array);
			array = one.modify(i);
		}
		return array;
	}
}
