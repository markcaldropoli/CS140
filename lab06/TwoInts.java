package lab06;

public class TwoInts extends OneInt {
	private int two;

	public TwoInts(int o, int t) {
		super(o);
		this.two = t;
	}

	@Override
	public int sum() {
		return super.sum()+two;
	}

	@Override
	public String toString() {
		return "("+super.toString()+", "+two+")";
	}
}
