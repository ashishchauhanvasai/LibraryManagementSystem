package LibraryManagementSystem_Controller;

import java.util.Comparator;

import LibraryManagementSystem_Model.Book;

public class SortByTitle implements Comparator<Book>{
	
	public int compare (Book b1 , Book b2) {
		return b1.getTitle().compareTo(b2.getTitle());
	}

}
