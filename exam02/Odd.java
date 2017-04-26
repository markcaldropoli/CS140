package exam02;

public class Odd extends Pos {
	@Override
	public boolean apply(int n) {
		//Assume n > 0
		if(n%2 == 1) {
			return true;
		}
		return false;
	}
}
