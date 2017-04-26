package exam02;

public class GEQ extends Pos {
	private int limit;
	
	public GEQ(int lim) {
		limit = lim;
	}
	
	@Override
	public boolean apply(int n) {
		if(n >= limit) {
			return true;
		}
		 return false;
	}
}
