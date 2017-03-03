package exam01;

public class Expander {
	public static int[] qAndR(int[] array, int n) {
		int[] arr = new int[array.length*2];
		if(array.length == 0) {
			int[] empty = new int[0];
			return empty;
		}
		int pos = 0;
		for(int i=0; i<array.length; i++) {
			int quotient = array[i]/n;
			int remainder = array[i]%n;
			arr[pos] = quotient;
			pos++;
			arr[pos] = remainder;
			pos++;
		}
		return arr;
	}
}
