package exam02;

import java.util.Arrays;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

public class Tester {
    private static final BinaryTree tree = new BinaryTree(3,
                                                          new BinaryTree(1,
                                                                         new BinaryTree(0),
                                                                         new BinaryTree(2)),
                                                          new BinaryTree(8,
                                                                         new BinaryTree(4),
                                                                         new BinaryTree(9)));
    
    private static final BinaryTree tree2 = new BinaryTree(5,
    		                                               new BinaryTree(2,
    		                                            		          new BinaryTree(0),
    																      null),
    														new BinaryTree(10,
    																       new BinaryTree(6),
    																       null));

    @Test
    public void testNumNodes() {
        assertEquals(7, tree.numNodes());
    }

    @Test
    public void testNumNonLeaves() {
        assertEquals(3, tree.numNonLeaves());
    }
    
    @Test
    public void testNumNodes2() {
    	assertEquals(5, tree2.numNodes());
    }
    
    @Test
    public void testNumNonLeaves2() {
    	assertEquals(3, tree2.numNonLeaves());
    }

    @Test
    public void testGCD() {
        assertEquals(7, Recursion.gcd(14, 7));
        assertEquals(7, Recursion.gcd(7, 14));
    }

    @Test
    public void testMax() {
        assertEquals(6,
                     Recursion.maxElement(new ArrayList<>(Arrays.asList(1, 2, 3,
                                                                        4, 5, 6))));
    }
    
    @Test
    public void testMax2() {
    	assertEquals(6, Recursion.maxElement(new ArrayList<>(Arrays.asList(6, 5, 4, 3, 2, 1))));
    }
    
    @Test
    public void testMax3() {
    	assertEquals(0, Recursion.maxElement(new ArrayList<>(Arrays.asList(0))));
    }
    
    @Test
    public void testMax4() {
    	assertEquals(7, Recursion.maxElement(new ArrayList<>(Arrays.asList(3, 2, 4, 7, 6, 5, 7))));
    }
    @Test
    public void testFunctions() {
        Pos p = new Pos();
        assertTrue(p.apply(5));
        assertFalse(p.apply(-1));
        GEQ f1 = new GEQ(5);
        assertTrue(f1.apply(10));
        assertTrue(f1.apply(5));
        assertFalse(f1.apply(2));
        assertFalse(f1.apply(-1));
        Odd f2 = new Odd();
        assertTrue(f2.apply(3));
        assertFalse(f2.apply(2));
    }

    @Test
    public void testFilter() {
        GEQ f1 = new GEQ(5);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> exp = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }
        for (int i = 5; i < 10; i++) {
            list.add(i);
            exp.add(i);
        }
        assertEquals(exp, Filter.filter(list, f1));
    }
    
    @Test
    public void testFilter2() {
    	Pos p1 = new Pos();
    	ArrayList<Integer> list = new ArrayList<>();
    	ArrayList<Integer> exp = new ArrayList<>();
    	for(int i=-4; i < 4; i++) {
    		list.add(i);
    	}
    	for(int i=1; i < 4; i++) {
    		exp.add(i);
    	}
    	assertEquals(exp, Filter.filter(list, p1));
    }
    
    @Test
    public void testFilter3() {
    	Odd o1 = new Odd();
    	ArrayList<Integer> list = new ArrayList<>();
    	ArrayList<Integer> exp = new ArrayList<>();
    	for(int i=0; i < 4; i++) {
    		list.add(i);
    	}
    	for(int i=1; i < 4; i+=2) {
    		exp.add(i);
    	}
    	assertEquals(exp, Filter.filter(list, o1));
    }
}
