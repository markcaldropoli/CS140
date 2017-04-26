package lab09green;

public class Child extends Parent {
	private int[] array;
	
	public Child(int[] arr1, int[] arr2) {
		super(arr1);
		this.array = arr2;
	}
	
	@Override
	public double average() {
		return new Parent(array).average();
	}
	
	@Override
	public int min() {
		return Math.max(super.min(), new Parent(array).min());
	}
}
