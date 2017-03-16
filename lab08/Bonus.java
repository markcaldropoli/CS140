package lab08;

public class Bonus {
	
	public static void main(String[] args) {
		printPascalsTriangle(5);
	}
	
	public static void printPascalsTriangle(int limit) {
		for(int i=0; i<limit+1; i++) {
	        int n = 1;
	        
	        for(int j=0; j<=i; j++) {
	             System.out.print(n+" ");
	             n = n * (i - j) / (j + 1);
	        }
	        
	        System.out.println();
	    }
	}
}
