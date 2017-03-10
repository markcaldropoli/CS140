package lab07;

public class RepeatIterator implements IntIterator {
	private int n;
	
	public RepeatIterator(int n) {
		this.n = n;
	}
	
	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Integer next() {
		return n;
	}
}
