package assignment03;

public class Test1 {

	public static void main(String[] args) {
		double[] arr1 = {1.0,2.0,3.0,4.0,5.0}; //Positives Array - Returns false
		double[] arr2 = {-1.0,-2.0,-3.0,-4.0,-5.0}; //Negatives Array - Returns true
		double[] arr3 = null; //Null Array - Returns false
		double[] arr4 = new double[0]; //Empty Array - Returns false
		
		System.out.println(Assig3.hasNegative(arr1));
		System.out.println(Assig3.hasNegative(arr2));
		System.out.println(Assig3.hasNegative(arr3));
		System.out.println(Assig3.hasNegative(arr4));
	}

}
