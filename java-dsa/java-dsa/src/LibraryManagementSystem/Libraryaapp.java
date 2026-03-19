package LibraryManagementSystem;
import java.util.Scanner;

public class Libraryaapp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();

        while(true){
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3.Search Book");
            System.out.println("4.Remove Book");
            System.out.println("5.Exit");

            System.out.print("Choose Option: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Book ID");
                    String  bookID = scanner.next();
                    System.out.println("Enter Book Title");
                    String  bookTitle = scanner.nextLine();
                    System.out.println("Enter Book Author");
                    String  bookAuthor = scanner.nextLine();

                    Book book = new Book(bookID, bookTitle, bookAuthor);
                    manager.addBook(book);

                    break;
                case 2:

                    manager.showBooks();
                    break;

                    case 3:
                        System.out.println("Enter Book Id: ");
                        String searchId = scanner.next();
                        manager.searchBook(searchId);
                        break;

                case 4:
                    System.out.print("Enter Book Id: ");
                    String removeId = scanner.next();
                    manager.removeBook(removeId);
                    break;
                case 5:
                    System.out.println("Exiting program...");

                    return;

                default:
                    System.out.println("Invalid input");
            }
        }




    }
}
