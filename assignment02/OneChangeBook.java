package assignment02;

public class OneChangeBook {
	private Book[] array;
	
	public OneChangeBook(Book[] a) {
		this.array = a;
	}
	
	public int smallestAfter(int start) {
		int index = start;
		for(int i=start+1; i<array.length; i++) {
			if(array[i].getNumPages() < array[index].getNumPages()) {
				index = i;
			}
		}
		return index;
	}
	
	public Book[] modify(int start) {
		Book[] temp = new Book[array.length];
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
