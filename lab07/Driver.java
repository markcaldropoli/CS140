package lab07;

public class Driver {
	
	public static void printFor(IntIterator itr, int limit) {
		for(int n : itr.toIterable()) {
			if(limit != 0) {
				System.out.print(n+", ");
				limit--;
			} else {
				break;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		RepeatIterator ritr = new RepeatIterator(27);
		printFor(ritr, 5);
		
		CyclicIterator citr = new CyclicIterator(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
		printFor(citr, 13);
		
		CountIterator cntitr1 = new CountIterator(0,5);
		printFor(cntitr1, 6);
		
		CountIterator cntitr2 = new CountIterator(0,2,10);
		printFor(cntitr2, 6);
		
		Integer[] ilist = {1,2,3,4,5,6,7};
		String[] slist = {"hi","hello","hey","howdy","hello there"};
		ZipIterator<Integer, String> zip = new ZipIterator<Integer, String>(ilist, slist);
		for(Pair<Integer, String> p : zip.toIterable()) {
			System.out.println(p);
		}
	}
}
