package LibraryManagementSystem_Controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import LibraryManagementSystem_Model.Book;

public class BookController {

	private ArrayList<Book> books = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public void sortBoks() {
		System.out.println("1. Sort based on Title ");
		System.out.println("2. Sort based on Author ");
		System.out.println("3. Sort based on Id ");
		System.out.println("Enter the Choice : ");
		int choice = scanner.nextInt() ; 
		Comparator sort = null ; 
		
		switch(choice) {
		case 1 : sort = new SortByTitle();
		break ; 
		case 2 : sort = new SortByAuthor() ; 
		break ; 
		case 3 : sort = new SortById() ; 
		break  ; 
		default : System.out.println("Enter the valid Choice ...!!!!!!");	
		}
		Collections.sort(books, sort);
		
		System.out.println(books);
	}

	public void addBook() {
		System.out.println("Enter the title : ");
		String title = scanner.next();
		System.out.println("Enter the Author Name : ");
		String author = scanner.next();
		System.out.println("Enter the Book Id : ");
		String id = scanner.next();
		Book book = new Book(title, author, id, true);
		books.add(book);
		System.out.println("Book Added to the Library Sucessfully...!!!!");
	}

	public void searchBook() {
		System.out.println("Enter the Title or Author or Id to search the Book : ");
		String str = scanner.next();
		boolean found = false;
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str)
					|| book.getId().equalsIgnoreCase(str)) {
				System.out.println("Book Found : ");
				System.out.println(book);
				found = true;
				break;
			}
		}
		if (found == false) {
			System.out.println("Book not found in the Library ....!");
		}
	}

	public void borrowBook() {
		System.out.println("Enter the Title or Author or Id to searchthe Book : ");
		String str = scanner.next();
		boolean found = false;
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str)
					|| book.getId().equalsIgnoreCase(str) && book.isAvailable()) {
				book.setAvailable(false);
				System.out.println("Book Borrowes Successfully !!!! ");
				found = true;
				break;
			}
		}
		if (found == false) {
			System.out.println("Book not Available for Borrow !!!!");
		}
	}

	public void returnBook() {
		System.out.println("Enter the title or Author or Id to Return Book");
		String str = scanner.next();
		boolean found = false;
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str)
					|| book.getId().equalsIgnoreCase(str) && !(book.isAvailable())) {
				book.setAvailable(true);
				System.out.println("Book Successfully Returned !!!! ");
				found = true;
				break;
			}
		}
		if (found == false) {
			System.out.println("Book not found in the Library !!!!");
		}
	}

	public void removeBook() {
		System.out.println("Enter the title or Author or Id to Remove Book");
		String str = scanner.next();
		boolean found = false;
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if (book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str)
					|| book.getId().equalsIgnoreCase(str)) {
				books.remove(i);
				System.out.println("Book Removed Successfully from the ArrayList.....!!!!");
				found = true;
				break;
			}
		}
		if (found == false) {
			System.out.println("Book not found in the Library !!!!");
		}

	}
	public void showBook() {
		if(books.size()!=0) {			
			for(Book b : books ) {
				System.out.println(b);
			}
		}
		else {
			System.out.println("No Book Present in Libraray.....!!");
		}
	}

}
