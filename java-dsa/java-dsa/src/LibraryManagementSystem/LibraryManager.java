package LibraryManagementSystem;

import java.util.ArrayList;

public class LibraryManager {

    private ArrayList<Book> books = new ArrayList<>();

    //Add book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added.");
    }

    //Show all books
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the Library.");
            return;


        }

        for (Book b : books) {
            b.display();
        }
    }

    //search book by ID
    public void searchBook(String id) {
        for (Book b : books) {
            if (b.getBookId().equals(id)) {
                System.out.println("Book found: ");
                b.display();
                return;
            }

        }
        System.out.println("Book not found.");

    }

    //Remove book
    public void removeBook(String id) {
        for (Book b : books) {

            if (b.getBookId().equals(id)) {

                books.remove(b);
                System.out.println("Book removed. ");
                return;
            }
        }
        System.out.println("Book not Found.");
    }
}

