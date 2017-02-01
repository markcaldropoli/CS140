package assignment02;

import java.util.Arrays;

public class TestBook {
	public static void main(String [] args) {
		Book[] books = new Book[3];
		books[0] = new Book("Java",500);
		books[1] = new Book("Python",450);
		books[2] = new Book("C++",600);
		System.out.println(Arrays.toString(books));
	}
}
