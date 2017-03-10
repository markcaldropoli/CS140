package lab07;

public class CountIterator implements IntIterator {
	private int start;
	private int step;
	private int stop = -1;
	
	public CountIterator(int start, int stop) {
		this.start = start;
		this.step = stop;
	}
	
	public CountIterator(int start, int step, int stop) {
		this.start = start;
		this.step = step;
		this.stop = stop;
	}
	
	@Override
	public boolean hasNext() {
		if(start == stop) {
			return false;
		}
		return true;
	}

	@Override
	public Integer next() {
		int temp = start;
		start += step;
		return temp;
	}
}
