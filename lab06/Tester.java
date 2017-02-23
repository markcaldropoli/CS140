package lab06;

import java.util.Arrays;
import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
        testInts();
        testPartitioner();
        testZipper();
    }

    public static void testInts() {
	//Test OneInts, TwoInts, nulls
        OneInt a = new OneInt(5);
        OneInt b = new OneInt(3);
	OneInt n = null;
        TwoInts c = new TwoInts(29, 5);
        TwoInts d = new TwoInts(2, 4);
	TwoInts n1 = null;
        ArrayList<OneInt> ints = new ArrayList<>();
        ints.add(a);
        ints.add(b);
        ints.add(c);
        ints.add(d);
	ints.add(n);
	ints.add(n1);
	System.out.println("expected 48, got " + OneInt.sumAll(ints));

	//Test null
	ArrayList<OneInt> nu = null;
	System.out.println("expected -1, got " + OneInt.sumAll(nu));

	//Test empty
	ArrayList<OneInt> empty = new ArrayList<>(0);
	System.out.println("expected 0, got " + OneInt.sumAll(empty));
    }

    public static void testPartitioner() {
	//Test Parent, Child
        Partitioner p = new Partitioner();
        Parent[] array = new Parent[5];
        array[0] = new Parent();
        array[1] = new Parent();
        array[2] = new Child();
        array[3] = new Parent();
        array[4] = new Child();
        p.partition(array);
        Parent[] pa = p.getParents();
        Child[] ca = p.getChildren();
        System.out.println("Parents: " + Arrays.toString(pa));
        System.out.println("Children: " + Arrays.toString(ca));

	//Test empty
	Parent[] a = new Parent[0];
	p.partition(a);
	Parent[] pe = p.getParents();
	Parent[] ce = p.getChildren();
	System.out.println("Parents: " + Arrays.toString(pe));
	System.out.println("Children: " + Arrays.toString(ce));
    }

    @SuppressWarnings("unused")
	public static void testZipper() {
	//Test good input
        int ret[] = Zipper.zip(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8});
        System.out.println("Expecting [1, 2, 3, 4, 5, 6, 7, 8]");
        System.out.println("Received " + Arrays.toString(ret));

	//Test empty
	int empty[] = Zipper.zip(new int[]{}, new int[]{});
	System.out.println("Expecting [], got " + Arrays.toString(new int[]{}));

	//Test null
	System.out.println("Expecting IllegalArgumentException: bad input");
	int n[] = Zipper.zip(null, null);
	int n1[] = Zipper.zip(null, new int[]{1,2});
	int n2[] = Zipper.zip(new int[]{1,2}, null);
	int dif[] = Zipper.zip(new int[]{1,2,3}, new int[]{1,2});
    }
}
