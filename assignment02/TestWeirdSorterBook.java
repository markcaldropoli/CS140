package assignment02;

import java.util.Arrays;

public class TestWeirdSorterBook {
	public static void main(String [] args) {
		Book[] test1 = {
				new Book("Book A", 3),
				new Book("Book B", 7),
				new Book("Book C", 9),
				new Book("Book D", 10),
				new Book("Book E", 2),
				new Book("Book F", 6),
				new Book("Book G", 3),
				new Book("Book H", 1)
		};
		
		Book[] test2 = {
				new Book("Book A", 100),
				new Book("Book B", 176),
				new Book("Book C", 150),
				new Book("Book D", 209)
		};
		
		WeirdSorterBook ws2 = new WeirdSorterBook(test1);
		System.out.println(Arrays.toString(ws2.sorted()));
		
		System.out.println("Average Number of Pages in test1: " + avgPagesInLibrary(test1));
		System.out.println("Average Number of Pages in test2: " + avgPagesInLibrary(test2));
	}
	
	public static double avgPagesInLibrary(Book[] books) {
		double totalPages = 0;
		for(Book b : books) {
			totalPages += b.getNumPages();
		}
		return totalPages/books.length;
	}
}
