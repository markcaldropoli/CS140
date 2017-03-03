package exam01;

public class Range extends MinMax {

	public Range(double[] arr) {
		super(arr);
	}

	@Override
	public double measure() {
		return super.value() - super.measure();
	}

	@Override
	public double value() {
		return super.value() / super.measure();
	}
}
