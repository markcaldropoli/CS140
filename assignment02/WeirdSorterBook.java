package assignment02;

public class WeirdSorterBook {
	private Book[] array;
	
	public WeirdSorterBook(Book[] a) {
		this.array = a;
	}
	
	public Book[] sorted() {
		for(int i=0; i<array.length-1; i++) {
			OneChangeBook one = new OneChangeBook(array);
			array = one.modify(i);
		}
		return array;
	}
}
