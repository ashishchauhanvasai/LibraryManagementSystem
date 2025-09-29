package LibraryManagementSystem_Controller;

import java.util.Comparator;

import LibraryManagementSystem_Model.Book;

public class SortById implements  Comparator<Book> {

	public int compare(Book b1, Book b2) {
		return b1.getId().compareTo(b2.getId());
	}

}
