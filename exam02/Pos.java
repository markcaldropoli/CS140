package exam02;

public class Pos implements BooleanFunction {
	public boolean apply(int n) {
		if(n > 0) {
			return true;
		}
		 return false;
	}
}
