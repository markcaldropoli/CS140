package lab02;

public class Library {
	public static void main(String [] args) {
		Book[] library = new Book[3];
		library[0] = new Book("Java",500);
		library[1] = new Book("Python",450);
		library[2] = new Book("C++",600);
		
		//Regular for loop
		/*for(int i=0; i<library.length; i++) {
			System.out.println(library[i].getTitle());
		}*/

		//Enhanced for loop
		for(Book b : library) {
			System.out.println(b.getNumPages());
		}

		System.out.println("\nExpected # of Pages: 1550");
		System.out.println("numPagesInLibrary: " + numPagesInLibrary(library));

		System.out.println("\nExpected Longest # of Pages: 600");
		System.out.println("mostPages: " + mostPages(library));
	}

	public static int numPagesInLibrary(Book[] books) {
		int pages = 0;
		for(Book b : books) {
			pages += b.getNumPages();
		}
		return pages;
	}

	public static int mostPages(Book[] books) {
		int longestBook = 0;
		for(Book b : books) {
			if(longestBook < b.getNumPages()) {
				longestBook = b.getNumPages();
			}
		}
		return longestBook;
	}
}
