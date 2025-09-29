package LibraryManagementSystem_View;
import java.util.Scanner;
import LibraryManagementSystem_Controller.BookController;

public class Library {

	public static void main(String[] args) {

		System.out.println(" Welcome to Library Management System .....!!!!");	
		BookController bookcontroller = new BookController();
		while(true) {
		System.out.println("1. Add Book");
		System.out.println("2. Search Book");
		System.out.println("3. Borrow Book");
		System.out.println("4. Return Book");
		System.out.println("5. Remove Book");
		System.out.println("6. Show Book");
		System.out.println("7. Sort Book");
		System.out.println("8. Exit");

		System.out.println("Enter the Choice : ");
		int choice = (new Scanner(System.in)).nextInt();
		
		switch (choice) {
					case 1: {
						bookcontroller.addBook();
						break;
					}

					case 2: {
						bookcontroller.searchBook();
						break;
					}
					case 3: {
						bookcontroller.borrowBook();
						break;
					}
					case 4: {
						bookcontroller.returnBook();
						break;
					}
					case 5: {
						bookcontroller.removeBook();
						break;
					}
					case 6: {
						bookcontroller.showBook();
						break;
					}
					case 7: {
						bookcontroller.sortBoks();
						break;
					}
					case 8:
						System.out.println("Application Closed !!!");
						return;
					default:
						System.out.println("Enter a valid choice .....!!! ");
		}
		}

	}

}
