package lab07;

import java.util.Iterator;

public class ZipIterator<K, V> implements Iterator<Pair<K, V>> {
	private K[] klist;
	private V[] vlist;
	private int pos;
	
	public ZipIterator(K[] klist, V[] vlist) {
		this.klist = klist;
		this.vlist = vlist;
	}
	
	@Override
	public boolean hasNext() {
		if(pos == klist.length || pos == vlist.length) {
			return false;
		}
		return true;
	}

	@Override
	public Pair<K, V> next() {
		int temp = pos;
		pos++;
		return new Pair<K, V>(klist[temp], vlist[temp]);
	}
	
	public Iterable<Pair<K, V>> toIterable() {
		return () -> this;
	}
}
