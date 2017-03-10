package lab07;

public class Pair<K, V> {
	public final K first; // allow direct access since final
	public final V second; // allow direct access since final
	
	/**
	 * Creates a Pair of a specific type
	 * @param first - the first element of the Pair
	 * @param second - the second element of the Pair
	 */
	public Pair(K first, V second) {
		this.first = first;
		this.second = second;
	}

	public String toString() {
		return "(" + first + ", " + second + ")";
	}
}
