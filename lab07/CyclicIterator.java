package lab07;

public class CyclicIterator implements IntIterator {
	private int[] list;
	private int pos = 0;
	
	public CyclicIterator(int[] list) {
		this.list = list;
	}
	
	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Integer next() {
		int temp = list[pos];
		if(pos == list.length-1) {
			pos = 0;
		} else {
			pos++;
		}
		return temp;
	}
}
