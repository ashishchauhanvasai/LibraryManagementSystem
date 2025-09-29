# 📚 Library Management System (Java)

A simple **Library Management System** built using Java following the **MVC (Model-View-Controller)** design pattern.  
This project allows users to **add, search, borrow, return, remove, display, and sort books** in a library.

---

## 🚀 Features
- Add new books with **Title**, **Author**, and **ID**
- Search books by **Title**, **Author**, or **ID**
- Borrow and return books (updates availability)
- Remove books from the library
- Display all books currently in the library
- Sort books by:
  - Title
  - Author
  - ID

---

## 🗂 Project Structure
LibraryManagementSystem/
│── bin/ # Compiled .class files
│── src/ # Source code
│ ├── LibraryManagementSystem_Controller/
│ │ ├── BookController.java # Handles library operations
│ │ ├── SortByAuthor.java # Comparator for sorting by author
│ │ ├── SortById.java # Comparator for sorting by ID
│ │ └── SortByTitle.java # Comparator for sorting by title
│ │
│ ├── LibraryManagementSystem_Model/
│ │ └── Book.java # Book entity (id, title, author, availability)
│ │
│ └── LibraryManagementSystem_View/
│ └── Library.java # Main class with main() method


---

## 🛠️ Technologies Used
- Java SE 21
- Collections Framework (`ArrayList`, `Comparator`, `Collections.sort`)
- Object-Oriented Programming (OOP)
- MVC Architecture

---

## ▶️ How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/LibraryManagementSystem.git


Open the project in your favorite IDE (Eclipse, IntelliJ IDEA, or VS Code).
Navigate to:
src/LibraryManagementSystem_View/Library.java

Run the main() method inside Library.java.
Follow the on-screen menu to:
Add books
Search, borrow, return, or remove books
Sort and display books

Adding a Book
Enter the title : Java
Enter the Author Name : James
Enter the Book Id : B101
Book Added to the Library Successfully...!!!!
Showing Books
Book{title='Java', author='James', id='B101', available=true}
Borrowing a Book
Enter the Title or Author or Id to search the Book : Java
Book Borrowed Successfully !!!!
Returning a Book
Enter the Title or Author or Id to Return Book : Java
Book Successfully Returned !!!!
Sorting Books
1. Sort based on Title 
2. Sort based on Author 
3. Sort based on Id 
Enter the Choice : 1
[Book{title='C++', author='Bjarne', id='B102', available=true}, Book{title='Java', author='James', id='B101', available=true}]
🤝 Contributing
Pull requests are welcome! If you’d like to improve this project:
Fork the repository
Create a new branch (feature-xyz)
Commit your changes
Open a Pull Request


📜 License
This project is licensed under the MIT License - feel free to use and modify it.


👨‍💻 Author: Ashish Chauhan
📌 A simple educational project for learning Java OOPs and MVC pattern.

