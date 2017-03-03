package exam01;

import java.util.Arrays;

public class Tester {
    private static int numWrong;

    public static void main(String[] args) {
        testQ1();
        System.out.println("--------------------");
        testQ2();
        System.out.println("--------------------");
        testQ3();
        System.out.println("--------------------");
        System.out.println(numWrong + " tests failed");
    }

    public static void testQ1() {
        Vector v = new Vector(0, 0);
        testEquality("0.0", v.getHorz());
        testEquality("0.0", v.getVert());
        testEquality("<0.0, 0.0>", v.toString());
        VectorPlot plot = new VectorPlot();
        plot.addVector(new Vector(3, 4));
        plot.addVector(new Vector(5, 12));
        plot.addVector(new Vector(6, 8));
        testEquality("<14.0, 24.0>", plot.findResultant());
        testEquality("1", plot.numMagnitudeAbove(11));

	//Test for non-negative
	//Vector v2 = new Vector(-1,-1);
	//testEquality("Components must be non-negative", v2.getHorz());
	//testEquality("Components must be non-negative", v2.getVert());

	//Test for null
	VectorPlot plot2 = new VectorPlot();
	plot2.addVector(null);
	plot2.addVector(null);
	plot2.addVector(null);
	testEquality("<0.0, 0.0>", plot2.findResultant());
	testEquality("0", plot2.numMagnitudeAbove(5));
	
	//Test for empty
	VectorPlot plot3 = new VectorPlot();
	testEquality("<0.0, 0.0>", plot3.findResultant());
	testEquality("0", plot3.numMagnitudeAbove(5));
    }

    public static void testQ2() {
        double[] array = {1.2, 3, 0.75, 0.5, 4, 2.7};
        MinMax mm = new MinMax(array);
        testEquality("0.5", mm.measure());
        testEquality("4.0", mm.value());
        Range r = new Range(array);
        testEquality("3.5", r.measure());
        testEquality("8.0", r.value());

    }

    public static void testQ3() {
        testEquality("[3, 1, 2, 0, 2, 1]",
                     Expander.qAndR(new int[]{10, 6, 7}, 3));
	//Test empty array
	int[] empty = new int[0];
	testEquality("[]", Expander.qAndR(empty, 2));
    }

    private static void testEquality(Object expected, Object actual) {
        if (!expected.toString().equals(actual.toString())) {
            ++numWrong;
            System.out.printf("FAILED: Expected '%s', received '%s'\n",
                              expected.toString(),
                              actual.toString());
        } else {
            System.out.printf("Passed: '%s' == '%s'\n",
                              expected.toString(),
                              actual.toString());
        }
    }

    private static void testEquality(Object expected, int[] actual) {
        testEquality(expected, Arrays.toString(actual));
    }
}
