package LibraryManagementSystem;

import java.util.HashMap;

public class LibraryManager {

    private HashMap<String, Book> books = new HashMap<>();


    //Add book
    public void addBook(Book book) {
        books.put(book.getBookId(), book);
        System.out.println("Book added.");
    }

    //Show all books
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the Library.");
            return;


        }

        for (Book b : books.values()) {
            b.display();
        }
    }

    //search book by ID
    public void searchBook(String id) {
        Book book = books.get(id);

        if (book != null) {
            System.out.println("Book found: ");
            book.display();
        } else {
            System.out.println("Book not found.");
        }
    }


    //Remove book
    public void removeBook(String id) {

        if (books.remove(id) != null) {
            System.out.println("Book removed.");

        } else {
            System.out.println("Book not found.");
        }
    }
}

